package com.example.abbassample.homework23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentStep1Binding


class Step1Fragment : Fragment() {
    private var binding: FragmentStep1Binding? = null




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentStep1Binding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding?.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.send?.setOnClickListener {
            val action = Step1FragmentDirections.actionStep1FragmentToStep2Fragment(binding?.emailtext?.text.toString())
            findNavController().navigate(action)
        }
    }

}