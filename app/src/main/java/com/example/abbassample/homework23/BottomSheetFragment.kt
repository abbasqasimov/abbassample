package com.example.abbassample.homework23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abbassample.R
import com.example.abbassample.databinding.FragmentBottomSheetBinding


class BottomSheetFragment : Fragment() {

    private var binding: FragmentBottomSheetBinding?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentBottomSheetBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding?.root


    }




}