package com.example.a27bilet

import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonCheck = 1
        var button = findViewById<Button>(R.id.button2)
        var buttonColor = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            when (buttonCheck) {
                1 -> {buttonColor.setBackgroundColor(BLUE)
                    buttonCheck = 2}
                2 -> {buttonColor.setBackgroundColor(RED)
                    buttonCheck = 3 }
                3 -> {buttonColor.setBackgroundColor(YELLOW)
                    buttonCheck = 1}
            }
        }
    }
}