package com.example.autoinsight

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hbb20.CountryCodePicker


class DataContactActivity : AppCompatActivity() {

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var a: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var b: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var c: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var d: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var e: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var f: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var g: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var h: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var i: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var j: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var k: EditText
        lateinit var l: EditText
        lateinit var m: EditText
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datacontact)

        val ccp: CountryCodePicker = this.findViewById(R.id.countryCodeHolder)
        j = this.findViewById(R.id.mobile)
        k = this.findViewById(R.id.email)

        ccp.registerCarrierNumberEditText(j)

        val verify = this.findViewById<Button>(R.id.verify)
        verify.setOnClickListener {
            if (j.text.toString().isEmpty() || k.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please fill the mandatory * field.",
                    Toast.LENGTH_SHORT)
                    .show()
            } else {
                val intent = Intent(this, DataOtpActivity::class.java).apply {
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