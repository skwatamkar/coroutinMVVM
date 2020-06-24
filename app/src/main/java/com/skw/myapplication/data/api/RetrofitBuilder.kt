package com.skw.myapplication.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private const val BASE_URL = "http://www.omdbapi.com/"

    val apiService: ApiService = getRetrofitBuilder().create(ApiService::class.java)

    fun getRetrofitBuilder(): Retrofit {

        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}