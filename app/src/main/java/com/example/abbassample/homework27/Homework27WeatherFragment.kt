package com.example.abbassample.homework27

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentHomework27WeatherBinding


class Homework27WeatherFragment : Fragment() {

    private var binding: FragmentHomework27WeatherBinding? = null
    private val viewModel: WeatherViewModel by viewModels<WeatherViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomework27WeatherBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getCurrentWeather()

        viewModel.data.observe(viewLifecycleOwner) { state ->

            when (state) {
                is WeatherViewModel.State.Loading -> {
                    binding?.Loading?.isVisible = state.isLoading
                }

                is WeatherViewModel.State.Error -> {
                    Toast.makeText(
                        requireContext(),
                        "Error: ${state.errorMessage}",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                is WeatherViewModel.State.Success -> {
                    onSuccess(state.weatherData)
                }
            }
            binding?.Go?.setOnClickListener {
                findNavController()
                    .navigate(
                        Homework27WeatherFragmentDirections
                            .actionHomework27WeatherFragmentToHomework27Weather2Fragment()
                    )
            }
        }
    }
    private fun onSuccess(data: WeatherResponse?) {
        if (data == null) return

        binding?.cityName?.text = data.location.name
        binding?.countryName?.text = data.location.country
        binding?.temp?.text = data.current.tempC.toString()
        binding?.status?.text = data.current.condition.text
        binding?.weatherIcon?.load("https:${data.current.condition.icon}")
    }
}