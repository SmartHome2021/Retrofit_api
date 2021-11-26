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

