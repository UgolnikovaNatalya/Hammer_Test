package com.example.test.api

import retrofit2.http.GET

interface DrinksApi {
    @GET("1/search.php?s=margarita")
    fun getDrink():retrofit2 .Call<GeneralInfo>
}