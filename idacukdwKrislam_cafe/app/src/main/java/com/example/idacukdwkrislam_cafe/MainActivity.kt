package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.idacukdwkrislam_cafe.databinding.ActivityMainBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        Handler(Looper.getMainLooper()).postDelayed({
            val currentUser = auth.currentUser
            val intent = if (currentUser != null) {
                Intent(this@MainActivity, MainFragment::class.java)
            } else {
                Intent(this@MainActivity, halaman_onboarding1::class.java)
            }
            startActivity(intent)
            finish()
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}
