package com.example.abbassample.homework27

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("current.json")
    fun getCurrentWeather(
        @Query("q") cityName: String,
        @Query("lang") language: String,
        @Query("key") apiKey: String
    ): Call<WeatherResponse>

    @GET("forecast.json")
    fun getWeatherForecast(
        @Query("q") cityName: String,
        @Query("days") days: Int,
        @Query("lang") language: String,
        @Query("key") apiKey: String
    ): Call<WeatherForecastResponse>
}