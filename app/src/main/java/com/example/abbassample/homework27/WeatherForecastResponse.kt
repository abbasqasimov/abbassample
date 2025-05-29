package com.example.abbassample.homework27

import com.google.gson.annotations.SerializedName

data class WeatherForecastResponse(
    val location: Location?,
    val current: Current?,
    val forecast: Forecast?
)

data class Location(
    val name: String?
)

data class Current(
    @SerializedName("temp_c")
    val tempC: String?,
    val condition: Condition?
)

data class Condition(
    val text: String?,
    val icon: String?
)

data class Forecast(
    @SerializedName("forecastday")
    val forecastDay: List<ForecastDay>?
)

data class ForecastDay(
    val date: String?,
    val day: ForecastCondition?
)

data class ForecastCondition(
    @SerializedName("avgtemp_c")
    val avgtempC: Double?,
    val condition: Condition?
)
