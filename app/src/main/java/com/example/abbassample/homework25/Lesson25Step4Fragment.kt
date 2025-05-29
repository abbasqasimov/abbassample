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
import com.example.abbassample.databinding.FragmentLesson25Step4Binding


class Lesson25Step4Fragment : Fragment() {

    private var binding: FragmentLesson25Step4Binding?=null
    private val viewModel: RegisterViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentLesson25Step4Binding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.continue1?.setOnClickListener {
            viewModel.name.observe(viewLifecycleOwner){ name->
                viewModel.setName(binding?.entername1?.text.toString())
            }
            viewModel.surname.observe(viewLifecycleOwner){ surname->
                viewModel.setSurname(binding?.entersurname?.text.toString())
            }
            findNavController().navigate(Lesson25Step4FragmentDirections.actionLesson25Step4FragmentToLesson25Step5Fragment())
        }
    }


}