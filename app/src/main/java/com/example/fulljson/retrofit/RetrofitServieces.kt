package com.example.fulljson.retrofit

import com.example.fulljson.models.Film
import retrofit2.Call
import retrofit2.http.*

interface RetrofitServieces {
    @GET("k_ft56zq4q")
//    @GET("marvel")
    fun getMovieList(): Call<Film>
}