package com.example.abbassample.homework27

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentHomework27Weather2Binding

class Homework27Weather2Fragment : Fragment() {

    private var binding: FragmentHomework27Weather2Binding?=null
    private val viewModel: WeatherForecastViewModel by viewModels<WeatherForecastViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomework27Weather2Binding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding?.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





        viewModel.getWeatherForecast()



        viewModel.data.observe(viewLifecycleOwner){state->
            when(state){
                is WeatherForecastViewModel.State.Loading -> {
                    binding?.Loading?.isVisible = state.isLoading
                }
                is WeatherForecastViewModel.State.Error ->{
                    Toast
                        .makeText(requireContext(), "Error: ${state.errorMessage}", Toast.LENGTH_SHORT)
                        .show()

                }
                is WeatherForecastViewModel.State.Success -> {
                    onSuccess(state.weatherData)
                }
            }
        }

    }
    private fun onSuccess(data: WeatherForecastResponse?) {
        if (data == null) return

        binding?.city?.text=data.location?.name
        binding?.temp?.text=data.current?.tempC
        binding?.status?.text=data.current?.condition?.text

        val adapter = WeatherAdapter()
        binding?.recycler?.layoutManager= LinearLayoutManager(requireContext())
        binding?.recycler?.adapter = adapter
        binding?.recycler?.isVisible=true

        val list = data.forecast?.forecastDay?.map {
            WeatherData2(
                day = it.date.orEmpty(),
                icon = it.day?.condition?.icon.orEmpty(),
                temp = it.day?.avgtempC ?: 0.0
            )

        }
        adapter.updateData(list.orEmpty())



    }

}




