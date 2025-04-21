package com.example.abbassample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.abbassample.databinding.AccountCreatedBinding
import com.example.abbassample.databinding.ActivityMainBinding
import com.example.abbassample.databinding.FragmentLoginBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText



class MainActivity : AppCompatActivity() {


    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)



        binding?.google?.setOnClickListener {
            val googleUrl="https://www.google.com"
            val newIntent= Intent(Intent.ACTION_VIEW, Uri.parse(googleUrl))
            startActivity(newIntent)

        }

        binding?.facebook?.setOnClickListener {
            val facebookUrl="https://www.facebook.com/"
            val newIntent=Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl))
            startActivity(newIntent)
        }

        binding?.apple?.setOnClickListener {
            val appleUrl="https://www.apple.com/"
            val newIntent=Intent(Intent.ACTION_VIEW, Uri.parse(appleUrl))
            startActivity(newIntent)
        }
        binding?.button?.setOnClickListener {
            val sendText = binding?.emailInput?.text.toString()
            val intent = Intent(this, AccountCreatedBinding::class.java)
            intent.putExtra("title",sendText)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}