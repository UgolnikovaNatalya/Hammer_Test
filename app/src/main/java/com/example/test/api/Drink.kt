package com.example.test.api


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Drink(

    //id
    @Json(name = "idDrink")
    val idDrink: String = "",

    //залк/не алк
    @Json(name = "strAlcoholic")
    val strAlcoholic: String = "",

    //название
    @Json(name = "strDrink")
    val strDrink: String = "",

    //картинка
    @Json(name = "strDrinkThumb")
    val strDrinkThumb: String = "",

    //инструкция
    @Json(name = "strInstructions")
    val strInstructions: String = "",


)