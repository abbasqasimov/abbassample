package com.example.abbassample.practice

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.abbassample.R
import com.example.abbassample.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.usdtext.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val input = s.toString()
                if (input.isNotEmpty()) {
                    val usd = input.toDoubleOrNull()

                    if (usd != null && usd > 0) {
                        val azn = usd * 1.7 // Burada kursu dəyişə bilərsən
                        binding.azntext.text = String.format("%.2f AZN", azn)
                    } else {
                        binding.azntext.text = "Xəta"
                    }
                } else {
                    binding.azntext.text = ""
                }
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

}