package com.example.test.presentation

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.ConnectivityManager.*
import android.net.NetworkCapabilities.*
import android.os.Build
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.test.api.Drink
import com.example.test.app.InternetApplication
import com.example.test.repository.CocktailsRepository
import com.example.test.ui
import com.example.test.usecases.GetCocktailUseCase
import java.io.IOException
import kotlin.concurrent.thread


sealed class States {

    object Loading : States()

    data class Error(val message: String) : States()

    data class Content(
        val drinkList: List<Drink>,
        val sortList: List<Drink>,
        val imageList: List<Drink>,
    ) : States()

}

class MainViewModel(private val useCase: GetCocktailUseCase, app: Application) : AndroidViewModel(app) {

    private val _state = MutableLiveData<States>()
    val state: LiveData<States> = _state

    fun load() {

        try {
            _state.value = States.Loading
            if (checkInternetConnection()){
                useCase(onSuccess = { drink ->
                    thread {
                        Thread.sleep(1_000)

                        ui {
                            _state.value = States.Content(
                                drinkList = drink,
                                sortList = drink,
                                imageList = drink
                            )
                            Log.d("SVG", drink.toString())
                        }
                    }

                }, onError = {
                    _state.value = States.Error(it)
                })
            }
            else{
                _state.value = States.Error("No internet")
            }

        } catch (e: Throwable){
            when(e){
                is IOException -> _state.value = States.Error("Internet Failure")
                else -> _state.value = States.Error("Conversion Error")
            }
        }


    }

    class MainViewModelFactory(val useCase: GetCocktailUseCase) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MainViewModel(useCase, app = Application()) as T
        }
    }

    private fun checkInternetConnection(): Boolean {
        val cm =
            getApplication<InternetApplication>().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            val activeNetwork = cm.activeNetwork ?: return false
            val cb = cm.getNetworkCapabilities(activeNetwork) ?: return false
            return when{
                cb.hasTransport(TRANSPORT_WIFI) -> true
                cb.hasTransport(TRANSPORT_CELLULAR) -> true
                cb.hasTransport(TRANSPORT_ETHERNET) -> true
                else-> false
            }
        } else{
            cm.activeNetworkInfo?.run {
                return when(type){
                    TYPE_WIFI -> true
                    TYPE_MOBILE -> true
                    TYPE_ETHERNET -> true
                    else -> false
                }
            }
        }
        return false
    }
}