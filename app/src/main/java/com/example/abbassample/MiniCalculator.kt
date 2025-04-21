package com.example.abbassample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.abbassample.databinding.MiniCalculatorBinding

class MiniCalculator : AppCompatActivity() {
    private var binding: MiniCalculatorBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=MiniCalculatorBinding.inflate(layoutInflater)
        setContentView(binding?.root)

    }
}