package com.example.autoinsight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login = this.findViewById<Button>(R.id.loginButton)
        login.setOnClickListener {
            val intent = Intent(this, SelectActivity::class.java).apply {
            }
            startActivity(intent)
        }

        val register = this.findViewById<TextView>(R.id.register)
        register.setOnClickListener {

            val intent = Intent(this, RegisterActivity::class.java).apply {

            }
            startActivity(intent)
        }
    }
}