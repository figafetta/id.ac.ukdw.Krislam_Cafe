package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.idacukdwkrislam_cafe.R

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.idacukdwkrislam_cafe.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Delay for 5 seconds before starting SecondActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, halaman_onboarding1::class.java)
            startActivity(intent)
            finish() // Close MainActivity so the user cannot navigate back to it
        }, 5000) // 5000 milliseconds = 5 seconds
    }

}
