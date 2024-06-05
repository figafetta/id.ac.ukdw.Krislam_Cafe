package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainFragment : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var textView: TextView
    private var user: FirebaseUser? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        auth = FirebaseAuth.getInstance()
        user = auth.currentUser
        if (user == null) {
            val intent = Intent(this@MainFragment, Login::class.java)
            startActivity(intent)
            finish()
            return
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomnavigationview)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Handle home action
                    replaceFragment(Home())
                    true
                }
                R.id.menu -> {
                    // Handle menu action
                    replaceFragment(Menu())
                    true
                }
                R.id.ranjang -> {
                    // Handle ranjang action
                    replaceFragment(Keranjang())
                    true
                }
                R.id.pesan -> {
                    // Handle pesan action
                    replaceFragment(Pemesanan())
                    true
                }
                R.id.profil -> {
                    // Handle profile action
                    replaceFragment(Profile())
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}
