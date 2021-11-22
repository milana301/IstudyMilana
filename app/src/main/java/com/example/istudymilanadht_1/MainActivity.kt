package com.example.istudymilanadht_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            startActivity(Intent(this, TwoActivity::class.java))
        }

        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            startActivity(Intent(this, FourActivity::class.java))
        }

    }
}