package com.example.abbassample.homework23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentStep2Binding


class Step2Fragment : Fragment() {
    private var binding: FragmentStep2Binding? = null

    private val args=navArgs<Step2FragmentArgs>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentStep2Binding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.continue1?.setOnClickListener {
            val action = Step2FragmentDirections.actionStep2FragmentToStep3Fragment(args.value.email, binding?.verification?.text.toString().toInt())
            findNavController().navigate(action)
        }
    }


}