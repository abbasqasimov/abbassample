package com.example.abbassample.homework25

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.abbassample.databinding.FragmentLesson25Step5Binding


class Lesson25Step6Fragment : Fragment() {


    private var binding: FragmentLesson25Step5Binding?=null
    private val viewModel: RegisterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentLesson25Step5Binding.inflate(inflater,container,false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val email = viewModel.email
        val password = viewModel.password
        val name = viewModel.name
        val surname = viewModel.surname
        val gender = viewModel.gender
        val code = viewModel.code

        binding?.alltext?.text="Email: $email\nPassword: $password\nName:$name\nSurname:$surname\nGender: $gender\nCode: $code"

        binding?.saveButton?.setOnClickListener {
            Toast.makeText(requireContext(), "Saved!", Toast.LENGTH_SHORT).show()
        }
    }

}