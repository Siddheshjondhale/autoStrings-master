package com.example.autoinsight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.autoinsight.DataContactActivity.Companion.a
import com.example.autoinsight.DataContactActivity.Companion.b
import com.example.autoinsight.DataContactActivity.Companion.c
import com.example.autoinsight.DataContactActivity.Companion.d
import com.example.autoinsight.DataContactActivity.Companion.e
import com.example.autoinsight.DataContactActivity.Companion.f

class DataPersonalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datapersonal)

        a = this.findViewById(R.id.firstName)
        b = this.findViewById(R.id.lastName)
        c = this.findViewById(R.id.houseNo)
        d = this.findViewById(R.id.city)
        e = this.findViewById(R.id.state)
        f = this.findViewById(R.id.pinCode)

        val pnextButton = this.findViewById<Button>(R.id.pnextButton)

        pnextButton.setOnClickListener {
            if (a.text.toString().isEmpty() || b.text.toString().isEmpty() || c.text.toString()
                    .isEmpty() || d.text.toString().isEmpty() || e.text.toString()
                    .isEmpty() || f.text.toString().isEmpty()
            ) {
                Toast.makeText(applicationContext, "Please fill all the mandatory * fields.", Toast.LENGTH_SHORT)
                    .show()
            }
            else {
                val intent = Intent(this, DataCarActivity::class.java).apply {
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