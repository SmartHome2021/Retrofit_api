package com.example.fulljson.common

import com.example.fulljson.retrofit.RetrofitClient
import com.example.fulljson.retrofit.RetrofitServieces

object Common {
//    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    private val BASE_URL = "https://imdb-api.com/en/API/Top250Movies/"
    val retrofitService: RetrofitServieces
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServieces::class.java)
}