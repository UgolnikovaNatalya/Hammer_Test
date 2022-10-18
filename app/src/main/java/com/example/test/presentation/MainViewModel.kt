package com.example.test.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test.api.Drink
import com.example.test.repository.CocktailsRepository
import com.example.test.ui


sealed class States {

    data class Error(val message: String) : States()

    data class Content(
        val drinkList: List<Drink>,
        val sortList: List<Drink>,
        val imageList: List<Drink>
    ) : States()

}

class MainViewModel : ViewModel() {

    private val repository = CocktailsRepository()

    private val _state = MutableLiveData<States>()
    val state : LiveData<States> = _state

    fun load(){
        repository.sendRequest(onSuccess = { drink ->
            ui {
                _state.value = States.Content(
                    drinkList = drink,
                    sortList = drink,
                    imageList = drink
                )
                Log.d("SVG", drink.toString())
            }

        }, onError = {
            _state.value = States.Error(it)
        })
    }
}