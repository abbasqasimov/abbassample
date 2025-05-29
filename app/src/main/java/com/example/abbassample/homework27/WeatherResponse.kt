package com.example.abbassample.homework27

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    val location: WeatherLocation,
    val current: WeatherCurrent
)

data class WeatherLocation(
    val name: String,
    val country: String
)

data class WeatherCurrent(

    @SerializedName("temp_c")
    val tempC: Double,

    @SerializedName("wind_kph")
    val windKph: Double,
    val condition: WeatherCondition

)
data class WeatherCondition (
    val text: String,
    val icon: String
)
