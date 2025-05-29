package com.example.abbassample.homework27

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherForecastViewModel: ViewModel() {

    private val _data: MutableLiveData<State> = MutableLiveData()
    val data: LiveData<State> = _data

    fun getWeatherForecast() {


        _data.value = State.Loading(true)
        ApiManager.getWeatherApi()
            .getWeatherForecast("Baku", 14, "en", "49c673f17ba24779a7c164045252505").enqueue(
                object : Callback<WeatherForecastResponse> {
                    override fun onResponse(
                        call: Call<WeatherForecastResponse>,
                        response: Response<WeatherForecastResponse>
                    ) {
                        _data.value = response.body()?.let { State.Success(it) }
                        _data.value = State.Loading(false)
                    }

                    override fun onFailure(call: Call<WeatherForecastResponse>, t: Throwable) {
                        _data.value = State.Error(t.message.toString())
                        _data.value = State.Loading(false)
                    }
                })
    }

    sealed class State {
        data class Loading(val isLoading: Boolean) : State()
        data class Success(val weatherData: WeatherForecastResponse) : State()
        data class Error(val errorMessage: String) : State()
    }
}