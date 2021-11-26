package com.example.fulljson

import MyMovieAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fulljson.common.Common
import com.example.fulljson.R
import com.example.fulljson.models.Film
import com.example.fulljson.models.FilmsResponse
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
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: MyMovieAdapter
    lateinit var rvFilms: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvFilms = findViewById(R.id.recyclerMovieList)
        mService = Common.retrofitService
        rvFilms.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        rvFilms.layoutManager = layoutManager

        getAllMovieList()

    }

    private fun getAllMovieList() {
        mService.getMovieList().enqueue(object : Callback<FilmsResponse> {
            override fun onFailure(call: Call<FilmsResponse>, t: Throwable) {
                Log.i("testFAIL", t.toString())
            }

            override fun onResponse(call: Call<FilmsResponse>, response: Response<FilmsResponse>) {
                val filmsResponse = response.body()
                adapter = MyMovieAdapter(baseContext, filmsResponse!!.items)
                adapter.notifyDataSetChanged()
                rvFilms.adapter = adapter

                Log.i("testACCES", response.toString())

            }

        })
    }


}
