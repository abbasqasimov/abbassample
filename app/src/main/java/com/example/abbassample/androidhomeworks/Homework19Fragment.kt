package com.example.abbassample.androidhomeworks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abbassample.R
import com.example.abbassample.databinding.ActivityMainBinding


class Homework19Fragment : Fragment() {


    private var binding:ActivityMainBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=ActivityMainBinding.inflate(inflater,container,true)
        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.signUpButton?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.createAccount, AccountCreatedFragment())
                .commit()
        }
    }
}