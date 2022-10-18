package com.example.test.api


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GeneralInfo(
    @Json(name = "drinks")
    val drinks: List<Drink> = listOf()
)