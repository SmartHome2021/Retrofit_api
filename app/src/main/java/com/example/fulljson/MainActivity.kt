package com.example.fulljson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fulljson.common.Common
import com.example.fulljson.models.Film
import com.example.fulljson.retrofit.RetrofitServieces
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var mService: RetrofitServieces
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mService = Common.retrofitService

        getAllMovieList()

    }

    private fun getAllMovieList() {
        mService.getMovieList().enqueue(object : Callback<Film> {
            override fun onFailure(call: Call<Film>, t: Throwable) {
                Log.i("testFAIL", t.toString())
            }

            override fun onResponse(call: Call<Film>, response: Response<Film>) {

                Log.i("testACCES", response.toString())

            }

        })
    }


}