package com.example.idacukdwkrislam_cafe

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DetailMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_menu)

        // Ambil referensi ke ImageButton back
        val buttonBack = findViewById<ImageButton>(R.id.buttonback)

        // Tetapkan listener untuk ImageButton back
        buttonBack.setOnClickListener {
            // Tutup aktivitas ini dan kembali ke aktivitas sebelumnya
            finish()
        }
    }
}
