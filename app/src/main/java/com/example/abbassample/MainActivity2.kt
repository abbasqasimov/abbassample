package com.example.abbassample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.abbassample.databinding.AccountCreatedBinding

class MainActivity2 : AppCompatActivity() {
    private var binding: AccountCreatedBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=AccountCreatedBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val titleText = intent.getStringExtra("title")
        binding?.accountCreated?.text=titleText
    }
    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}