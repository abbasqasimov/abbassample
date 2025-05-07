package com.example.abbassample.androidhomeworks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.abbassample.databinding.Homework20Binding

class Homework20Activity : AppCompatActivity() {
    private var binding: Homework20Binding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=Homework20Binding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.home?.setOnClickListener {
            binding?.textView?.text=binding?.home?.text
            
        }
        binding?.competition?.setOnClickListener {
            binding?.textView?.text=binding?.competition?.text
        }
        binding?.news?.setOnClickListener {
            binding?.textView?.text=binding?.news?.text
        }
        binding?.account?.setOnClickListener {
            binding?.textView?.text=binding?.account?.text
        }

    }
}