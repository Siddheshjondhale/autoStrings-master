package com.example.autoinsight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class WashPersonalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_washpersonal)


        DataContactActivity.a = this.findViewById(R.id.firstName)
        DataContactActivity.b = this.findViewById(R.id.lastName)
        DataContactActivity.c = this.findViewById(R.id.houseNo)
        DataContactActivity.d = this.findViewById(R.id.city)
        DataContactActivity.e = this.findViewById(R.id.state)
        DataContactActivity.f = this.findViewById(R.id.pinCode)

        val pnextButton = this.findViewById<Button>(R.id.pnextButton)

        pnextButton.setOnClickListener {
            if (DataContactActivity.a.text.toString().isEmpty() || DataContactActivity.b.text.toString().isEmpty() || DataContactActivity.c.text.toString()
                    .isEmpty() || DataContactActivity.d.text.toString().isEmpty() || DataContactActivity.e.text.toString()
                    .isEmpty() || DataContactActivity.f.text.toString().isEmpty()
            ) {
                Toast.makeText(applicationContext, "Please fill all the mandatory * fields.", Toast.LENGTH_SHORT)
                    .show()
            }
            else {
                val intent = Intent(this, WashCarActivity::class.java).apply {
                }
                startActivity(intent)
            }
        }


        val logout = this.findViewById<ImageView>(R.id.logout)
        logout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java).apply {
            }
            startActivity(intent)
        }
    }
}