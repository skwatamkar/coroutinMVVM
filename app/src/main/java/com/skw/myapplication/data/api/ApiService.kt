package com.skw.myapplication.data.api

import com.skw.myapplication.data.model.movieInfo
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(".")
    suspend fun getMovieInformation(
        @Query("i") i: String,
        @Query("apikey") apikey: String
    ): movieInfo
}