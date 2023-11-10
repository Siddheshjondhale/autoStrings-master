package com.example.autoinsight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import java.util.Locale

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailEditText = findViewById<EditText>(R.id.firstName) // Assuming this is the email input field
        val passwordEditText = findViewById<EditText>(R.id.passWord) // Assuming this is the password input field

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
                loginUser(email, password)


        }

        val register = findViewById<TextView>(R.id.register)
        register.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun loginUser(email: String, password: String) {
        val auth = FirebaseAuth.getInstance()
        val loweremail=email?.toLowerCase(Locale.ROOT)
        val emailusername= "$loweremail@autostrings.com"
        auth.signInWithEmailAndPassword(emailusername, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Login was successful
                        val user = auth.currentUser
                    Toast.makeText(this, loweremail.toString()+" Login successfully", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, SelectActivity::class.java)
                    startActivity(intent)
                } else {
                    // Login failed
                    // Handle login failure, show an error message, etc.
                }
            }
    }


}
