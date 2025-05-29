package com.example.abbassample.homework25

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentLesson25Step3Binding


class Lesson25Step3Fragment : Fragment() {

    private var binding: FragmentLesson25Step3Binding?=null
    private val viewModel: RegisterViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentLesson25Step3Binding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.contine?.setOnClickListener {
            viewModel.password.observe(viewLifecycleOwner){ password->
                viewModel.setPassword(binding?.editTextSetPassword?.text.toString())
            }

            findNavController().navigate(Lesson25Step3FragmentDirections.actionLesson25Step3FragmentToLesson25Step4Fragment())
        }
    }


}