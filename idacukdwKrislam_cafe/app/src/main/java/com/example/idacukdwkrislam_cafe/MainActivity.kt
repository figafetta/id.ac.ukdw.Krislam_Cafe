package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay for 5 seconds before starting SecondActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, halaman_onboarding1::class.java)
            startActivity(intent)
            finish() // Close MainActivity so the user cannot navigate back to it
        }, 5000) // 5000 milliseconds = 5 seconds
    }
}