package com.example.abbassample.homework27

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiManager {

    private val retrofitWeather = Retrofit.Builder()
        .baseUrl("https://api.weatherapi.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getWeatherApi():WeatherApiService{
        return retrofitWeather.create(WeatherApiService::class.java)
    }
}