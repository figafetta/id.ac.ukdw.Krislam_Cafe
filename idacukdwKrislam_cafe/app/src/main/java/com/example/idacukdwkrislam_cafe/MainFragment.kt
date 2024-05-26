package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainFragment : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var textView: TextView
    private lateinit var user: FirebaseUser
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        auth = FirebaseAuth.getInstance()
        textView = findViewById(R.id.welcomeUser)
        user = auth.currentUser!!
        if(user == null){
            val intent = Intent(this@MainFragment,Login::class.java)
            startActivity(intent)
            finish()
        }
        else{
            textView.setText(user.email)
        }
    }
}