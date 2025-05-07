package com.example.abbassample.homework23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentStep4Binding


class Step4Fragment : Fragment() {
    private var binding: FragmentStep4Binding? = null
    val args=navArgs<Step4FragmentArgs>()






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentStep4Binding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding?.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.continue1?.setOnClickListener {
            val action = Step4FragmentDirections.actionStep4FragmentToStep5Fragment(
                args.value.email,
                args.value.verification,
                args.value.setpassword,
                binding?.entername1?.text.toString(),
                binding?.entersurname?.text.toString(),
                binding?.entergender?.text.toString()
            )
            findNavController().navigate(action)
        }
    }



}