package com.example.idacukdwkrislam_cafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class halaman_onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halaman_onboarding2)

        val buttonBerikutnya = findViewById<Button>(R.id.buttohalaman3berikutnya)
        buttonBerikutnya.setOnClickListener {
            val intent = Intent(this, halaman_onboarding3::class.java)
            startActivity(intent)
        }
    }
}
