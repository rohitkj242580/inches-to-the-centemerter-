package com.example.inchestocentemeter

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val inchesToCentimeters = 2.54
    lateinit var enterInches: EditText
    lateinit var buttonConvert: Button
    lateinit var textViewConverted: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        enterInches = findViewById(R.id.editTextINches)
        buttonConvert = findViewById(R.id.buttoncinverter)
        textViewConverted = findViewById(R.id.textViewConverted)

        buttonConvert.setOnClickListener {
            if (enterInches.text.toString().isNotEmpty())
            {
                val result = enterInches.text.toString().toDouble() * inchesToCentimeters
                textViewConverted.text = result.toString()
            }
            else{
                textViewConverted.text = getString(R.string.emptytext)
            }
        }

    }


}
