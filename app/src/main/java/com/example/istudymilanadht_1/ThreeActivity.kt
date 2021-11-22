package com.example.istudymilanadht_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            startActivity(Intent(this, FourActivity::class.java))
        }

        val imageView5 = findViewById<ImageView>(R.id.imageView5)

        imageView5.setOnClickListener {
            startActivity(Intent(this, TwoActivity::class.java))
        }

    }
}