package com.example.abbassample.homework21

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.abbassample.R
import com.example.abbassample.databinding.ActivityHomework21Binding
import com.example.abbassample.databinding.FragmentListBinding


class ListFragment : Fragment() {

    private var binding:ActivityHomework21Binding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=ActivityHomework21Binding.inflate(inflater,container,false)
        return binding?.root
    }



}