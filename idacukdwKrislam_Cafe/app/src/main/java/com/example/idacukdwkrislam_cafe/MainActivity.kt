package com.example.idacukdwkrislam_cafe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import com.example.idacukdwkrislam_cafe.OnboardingPage2


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_page1)

        val buttonGoToSecondActivity: Button = findViewById(R.id.button_page1_next)
        buttonGoToSecondActivity.setOnClickListener {
            val intent = Intent(this, OnboardingPage2::class.java)
            startActivity(intent)
        }
    }
}