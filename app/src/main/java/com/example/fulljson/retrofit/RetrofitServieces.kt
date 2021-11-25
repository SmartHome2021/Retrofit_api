package com.example.fulljson.retrofit

import com.example.fulljson.models.Film
import com.example.fulljson.models.FilmsResponse
import retrofit2.Call
import retrofit2.http.*

interface RetrofitServieces {
    @GET("API/Top250Movies/k_ft56zq4q")
//    @GET("marvel")
    fun getMovieList(): Call<FilmsResponse>
}