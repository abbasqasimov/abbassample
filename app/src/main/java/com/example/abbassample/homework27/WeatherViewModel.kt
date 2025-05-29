package com.example.abbassample.homework27
//apiKey:49c673f17ba24779a7c164045252505
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherViewModel : ViewModel() {


    private val _data: MutableLiveData<State> = MutableLiveData()
    val data: LiveData<State> = _data

    fun getCurrentWeather() {

        _data.value = State.Loading(true)

        ApiManager.getWeatherApi()
            .getCurrentWeather("Baku", "en", "49c673f17ba24779a7c164045252505")
            .enqueue(object : Callback<WeatherResponse> {
                override fun onResponse(
                    call: Call<WeatherResponse>,
                    response: Response<WeatherResponse>
                ) {
                    _data.value = response.body()?.let { State.Success(it) }
                    _data.value = State.Loading(false)

                }

                override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                    _data.value = State.Error(t.message.toString())
                    _data.value = State.Loading(false)
                }
            })
    }


    sealed class State {
        data class Loading(val isLoading: Boolean) : State()
        data class Success(val weatherData: WeatherResponse) : State()
        data class Error(val errorMessage: String) : State()
    }
}