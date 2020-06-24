package com.skw.myapplication.data.api

class APIHelper(private val apiService: ApiService) {

    suspend fun getMovieInformation(apikey: String) =
        apiService.getMovieInformation("tt3896198", apikey)
}