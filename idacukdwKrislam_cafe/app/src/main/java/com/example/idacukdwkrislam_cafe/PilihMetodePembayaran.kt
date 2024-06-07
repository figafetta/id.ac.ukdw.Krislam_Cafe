package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PilihMetodePembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pilih_metode_pembayaran)

        // Ambil referensi ke Button bayar
        val buttonBayar = findViewById<Button>(R.id.ButtonBayar)

        // Tetapkan listener untuk Button bayar
        buttonBayar.setOnClickListener {
            // Tampilkan pesan "Pembayaran berhasil"
            Toast.makeText(this, "Pembayaran berhasil", Toast.LENGTH_SHORT).show()

            // Arahkan ke halaman beranda (home)
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)

            // Tutup aktivitas saat ini
            finish()
        }
    }
}
