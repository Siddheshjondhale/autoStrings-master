package com.example.autoinsight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.hbb20.CountryCodePicker

class WashContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_washcontact)
        val ccp: CountryCodePicker = this.findViewById(R.id.countryCodeHolder)
        DataContactActivity.j = this.findViewById(R.id.mobile)
        DataContactActivity.k = this.findViewById(R.id.email)

        ccp.registerCarrierNumberEditText(DataContactActivity.j)

        val verify = this.findViewById<Button>(R.id.verify)
        verify.setOnClickListener {
            if (DataContactActivity.j.text.toString().isEmpty() || DataContactActivity.k.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please fill the mandatory * field.",
                    Toast.LENGTH_SHORT)
                    .show()
            } else {
                val intent = Intent(this, WashOtpActivity::class.java).apply {
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