package com.example.istudymilanadht_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val button7 = findViewById<Button>(R.id.button7)

        button7.setOnClickListener {
            startActivity(Intent(this, ThreeActivity::class.java))
        }

        val imageView3 = findViewById<ImageView>(R.id.imageView3)

        imageView3.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}