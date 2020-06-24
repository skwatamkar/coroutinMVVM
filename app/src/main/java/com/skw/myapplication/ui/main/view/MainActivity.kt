package com.skw.myapplication.ui.main.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.skw.myapplication.R
import com.skw.myapplication.data.api.APIHelper
import com.skw.myapplication.data.api.RetrofitBuilder
import com.skw.myapplication.ui.main.viewmodel.MainViewModel
import com.skw.myapplication.ui.main.viewmodel.ViewModelFactory


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewModel()
        setObserver()

        //Toast.makeText(this, BuildConfig.API_KEY, Toast.LENGTH_SHORT).show()
    }

    private fun setObserver() {
        viewModel.getMovieInformation().observe(this, Observer {
            Toast.makeText(this, it.toString(), Toast.LENGTH_LONG).show()
        })
    }

    private fun setViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(APIHelper(RetrofitBuilder.apiService))
        ).get(MainViewModel::class.java)
    }
}
