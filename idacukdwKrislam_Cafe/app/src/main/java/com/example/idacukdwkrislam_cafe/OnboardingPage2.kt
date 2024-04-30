package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class OnboardingPage2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_page2)

        val buttonGoToThirdActivity: Button = findViewById(R.id.button_page2_next)
        buttonGoToThirdActivity.setOnClickListener {
            val intent = Intent(this, OnboardingPage3::class.java)
            startActivity(intent)
        }
    }
}
    