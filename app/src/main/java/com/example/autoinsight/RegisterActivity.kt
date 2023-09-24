package com.example.autoinsight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerBtn = this.findViewById<Button>(R.id.registerBtn)
        registerBtn.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java).apply {

            }
            startActivity(intent)
        }

    }
}