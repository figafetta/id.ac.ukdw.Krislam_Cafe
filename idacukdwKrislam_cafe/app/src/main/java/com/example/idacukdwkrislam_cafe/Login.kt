package com.example.idacukdwkrislam_cafe

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    private lateinit var editTextEmail: TextInputEditText
    private lateinit var editTextPassword: TextInputEditText
    private lateinit var buttonLogin: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        auth = FirebaseAuth.getInstance() // Initializing auth here
        editTextEmail = findViewById(R.id.emailEditText)
        editTextPassword = findViewById(R.id.editTextTextPassword)
        buttonLogin = findViewById(R.id.login)
        textView = findViewById(R.id.daftar)

        textView.setOnClickListener {
            val intent = Intent(this@Login, Register::class.java)
            startActivity(intent)
            finish()
        }

        buttonLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this@Login, "Enter Email", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                Toast.makeText(this@Login, "Enter Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Toast.makeText(
                            baseContext,
                            "Login Successful.",
                            Toast.LENGTH_SHORT,
                        ).show()
                        val intent = Intent(this@Login, MainFragment::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(
                            baseContext,
                            "Login failed.",
                            Toast.LENGTH_SHORT,
                        ).show()
                    }
                }
        }
    }

    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if (currentUser != null) {
            Log.d("LoginActivity", "User already logged in, redirecting to MainFragment")
            val intent = Intent(this@Login, MainFragment::class.java)
            startActivity(intent)
            finish()
        } else {
            Log.d("LoginActivity", "No user logged in, staying on login page")
        }
    }
}
