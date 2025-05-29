package com.example.abbassample.homework25

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentLesson25Step5Binding
import com.example.abbassample.databinding.FragmentLesson25Step6Binding

class Lesson25Step5Fragment : Fragment() {

    private var binding: FragmentLesson25Step6Binding?=null
    private val viewModel: RegisterViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLesson25Step6Binding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.setGender("Male")
        binding?.male?.setOnClickListener {
            showGenderDialog()
        }
        binding?.female?.setOnClickListener {
            showGenderDialog()
        }
        binding?.alert?.setOnClickListener {
            findNavController().navigate(Lesson25Step5FragmentDirections.actionLesson25Step5FragmentToLesson25Step6Fragment())
        }

    }

    private fun showGenderDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Gender")
        builder.setMessage("Please select gender")
        builder.setPositiveButton("Male") { _, _ ->
            viewModel.setGender("Male")
        }
        builder.setNegativeButton("Female") { _, _ ->
            viewModel.setGender("Female")
        }
        builder.show()
    }



}