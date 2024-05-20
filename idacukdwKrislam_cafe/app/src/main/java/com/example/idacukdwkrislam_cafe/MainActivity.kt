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
        replaceFragment(Home())

        // Set listener for bottom navigation view
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Handle home item click
                    replaceFragment(Home())
                }
                R.id.menu -> {
                    // Handle menu item click
                    replaceFragment(Menu())
                }
                R.id.ranjang -> {
                    // Handle ranjang item click
                    replaceFragment(Keranjang())
                }
                R.id.pesan -> {
                    // Handle pesan item click
                    replaceFragment(Pemesanan())
                }
                R.id.profil -> {
                    // Handle profil item click
                    replaceFragment(Profile())
                }
            }
            true // Return true to indicate that the item click is handled
        }

        // Delay for 5 seconds before starting SecondActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, halaman_onboarding1::class.java)
            startActivity(intent)
            finish() // Close MainActivity so the user cannot navigate back to it
        }, 5000) // 5000 milliseconds = 5 seconds
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }

}
