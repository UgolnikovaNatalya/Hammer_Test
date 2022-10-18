package com.example.test.repository

import com.example.test.api.NetworkModule
import com.example.test.api.Drink
import kotlin.concurrent.thread

class CocktailsRepository {

    fun sendRequest(onSuccess: (List<Drink>) -> Unit, onError: (String) -> Unit){

        thread {
            val api = NetworkModule.api
            val request = api.getDrink()
            val response = request.execute()
            val body = response.body()

            if (response.isSuccessful && body != null) {
                onSuccess(body.drinks)
            } else{
                onError(response.errorBody().toString())
            }
        }
    }
}