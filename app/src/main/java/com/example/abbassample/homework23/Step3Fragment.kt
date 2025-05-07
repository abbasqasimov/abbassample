package com.example.abbassample.homework23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentStep3Binding


class Step3Fragment : Fragment() {
    private val args=navArgs<Step3FragmentArgs>()

    private var binding: FragmentStep3Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentStep3Binding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.contine?.setOnClickListener {
            val action = Step3FragmentDirections.actionStep3FragmentToStep4Fragment(args.value.email,args.value.verification, binding?.editTextSetPassword?.text.toString())
            findNavController().navigate(action)
        }
    }
}