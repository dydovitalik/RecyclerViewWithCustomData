package com.example.firstapp.network

import retrofit2.Call
import com.example.firstapp.RecyclerList
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {

    @GET("repositories")//repositories?q=newyork
    fun getDataFromAPI(@Query("q") query: String):Call<RecyclerList>
}