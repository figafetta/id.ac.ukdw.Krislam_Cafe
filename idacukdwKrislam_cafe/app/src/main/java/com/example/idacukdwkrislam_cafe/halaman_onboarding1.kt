package com.example.idacukdwkrislam_cafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class halaman_onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halaman_onboarding1)

        val buttonBerikutnya = findViewById<Button>(R.id.buttohalaman2_berikutnya)
        buttonBerikutnya.setOnClickListener {
            val intent = Intent(this, halaman_onboarding2::class.java)
            startActivity(intent)
        }
    }
}
