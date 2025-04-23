package com.example.abbassample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.abbassample.databinding.ActivityMainBinding

class Homework19Activity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.button?.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.createAccount,AccountCreatedFragment())
                .addToBackStack("")
                .commit()
        }

    }
}