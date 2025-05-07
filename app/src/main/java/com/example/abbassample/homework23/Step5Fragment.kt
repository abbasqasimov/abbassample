package com.example.abbassample.homework23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentStep5Binding


class Step5Fragment : Fragment() {
    private var binding: FragmentStep5Binding? = null
    val args=navArgs<Step5FragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentStep5Binding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.alltext?.text =
            "Email:${args.value.email}" +
                "\nPassword:${args.value.setpassword}" +
                "\nName:${args.value.name}" +
                "\nSurname:${args.value.surname}" +
                "\nGender:${args.value.gender}"

    }


}