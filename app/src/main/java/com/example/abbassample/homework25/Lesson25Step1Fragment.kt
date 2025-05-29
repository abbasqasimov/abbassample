package com.example.abbassample.homework25

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentLesson25Step1Binding

class Lesson25Step1Fragment : Fragment() {

    private var binding: FragmentLesson25Step1Binding?=null
    private val viewModel: RegisterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentLesson25Step1Binding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.send?.setOnClickListener {
            viewModel.email.observe(viewLifecycleOwner) { emailValue ->
                viewModel.setEmail(binding?.emailtext?.text.toString())
            }
            findNavController().navigate(Lesson25Step1FragmentDirections.actionLesson25Step1FragmentToLesson25Step2Fragment())
        }
        
    }
}
