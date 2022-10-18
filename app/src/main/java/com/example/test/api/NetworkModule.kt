package com.example.test.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

object NetworkModule {
    private val server = OkHttpClient().newBuilder()
        .connectTimeout(30_000, TimeUnit.MILLISECONDS)
        .writeTimeout(30_000, TimeUnit.MILLISECONDS)
        .readTimeout(30_000, TimeUnit.MILLISECONDS)
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://www.thecocktaildb.com/api/json/v1/")
        .addConverterFactory(MoshiConverterFactory.create())
        .client(server)
        .build()

    val api = retrofit.create<DrinksApi>()
}