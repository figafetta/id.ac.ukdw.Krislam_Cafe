package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonGoToLoginActivity: TextView = findViewById(R.id.textViewDaftar)
        buttonGoToLoginActivity.setOnClickListener {
            val intent = Intent(this, Daftar::class.java)
            startActivity(intent)
        }
        val buttonGoToFragBerandaActivity: Button = findViewById(R.id.button_FragBeranda_next)
        buttonGoToFragBerandaActivity.setOnClickListener {
            val intent = Intent(this, MainFragmen::class.java)
            startActivity(intent)
        }
    }
}
    