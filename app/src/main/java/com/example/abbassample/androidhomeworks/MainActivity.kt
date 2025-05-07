package com.example.abbassample.androidhomeworks

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.abbassample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.google?.setOnClickListener {
            val googleUrl="https://www.google.com"
            val newIntent= Intent(Intent.ACTION_VIEW, Uri.parse(googleUrl))
            startActivity(newIntent)
        }

        binding?.facebook?.setOnClickListener {
            val facebookUrl="https://www.facebook.com/"
            val newIntent= Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl))
            startActivity(newIntent)
        }

        binding?.apple?.setOnClickListener {
            val appleUrl="https://www.apple.com/"
            val newIntent= Intent(Intent.ACTION_VIEW, Uri.parse(appleUrl))
            startActivity(newIntent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}