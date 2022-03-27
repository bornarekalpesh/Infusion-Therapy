package com.example.infusion_therapy.network

import com.example.infusion_therapy.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiHelper {
    fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}