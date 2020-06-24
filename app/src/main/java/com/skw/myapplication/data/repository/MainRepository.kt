package com.skw.myapplication.data.repository

import com.skw.myapplication.data.api.APIHelper

class MainRepository(val apiHelper: APIHelper) {

    suspend fun getMovieInformation(apikey: String) = apiHelper.getMovieInformation(apikey)
}