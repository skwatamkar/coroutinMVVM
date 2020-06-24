package com.skw.myapplication.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.skw.myapplication.BuildConfig
import com.skw.myapplication.data.repository.MainRepository
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getMovieInformation() = liveData(Dispatchers.IO) {

        emit(mainRepository.getMovieInformation(BuildConfig.API_KEY))

    }

}