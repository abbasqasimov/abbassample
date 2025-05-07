package com.example.abbassample.androidhomeworks

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.abbassample.R
import com.example.abbassample.databinding.ActivityMainBinding

class Homework19Activity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.signUpButton?.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("abbas", binding?.entername?.text.toString())
            val fragment=AccountCreatedFragment()
            fragment.arguments=bundle
            binding?.myView?.visibility=View.GONE
            binding?.container?.visibility=View.VISIBLE
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit()
        }

        binding?.google?.setOnClickListener {
            binding?.myView?.visibility=View.GONE
            binding?.container?.visibility=View.VISIBLE
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, GoogleFragment())
                .commit()

        }
        binding?.facebook?.setOnClickListener {
            binding?.myView?.visibility=View.GONE
            binding?.container?.visibility=View.VISIBLE
            supportFragmentManager.beginTransaction()
                .replace(R.id.container,FacebookFragment())
                .commit()
        }
        binding?.apple?.setOnClickListener {
            binding?.myView?.visibility=View.GONE
            binding?.container?.visibility=View.VISIBLE
            supportFragmentManager.beginTransaction()
                .replace(R.id.container,AppleFragment())
                .commit()
        }


    }
}