package com.example.autoinsight

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.autoinsight.DataContactActivity.Companion.g
import com.example.autoinsight.DataContactActivity.Companion.h
import com.example.autoinsight.DataContactActivity.Companion.i
import com.example.autoinsight.DataContactActivity.Companion.l
import com.example.autoinsight.DataContactActivity.Companion.m



class DataCarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datacar)

        /*g = this.findViewById(R.id.manf)
        h = this.findViewById(R.id.model)
        i = this.findViewById(R.id.manfYear)
        l = this.findViewById(R.id.regNo)
        m = this.findViewById(R.id.fuel)*/

        val fuelType = resources.getStringArray(R.array.fuelType)
        val arrayAdapterFuel: ArrayAdapter<String> = ArrayAdapter(this, R.layout.dropdown, fuelType)
        val fuel = findViewById<AutoCompleteTextView>(R.id.fuel)
        fuel.setAdapter(arrayAdapterFuel)

        val carSegment = resources.getStringArray(R.array.carSegment)
        val arrayAdapterSegment: ArrayAdapter<String> = ArrayAdapter(this, R.layout.dropdown, carSegment)
        val segment = findViewById<AutoCompleteTextView>(R.id.segment)
        segment.setAdapter(arrayAdapterSegment)


        val cnextButton = this.findViewById<Button>(R.id.cnextButton)
        cnextButton.setOnClickListener {
            /*if (g.text.toString().isEmpty() || h.text.toString().isEmpty() || i.text.toString().isEmpty() || l.text.toString().isEmpty() || m.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please fill all the mandatory * fields.",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {*/
            val intent = Intent(this, DataStatusActivity::class.java).apply {
            }
            startActivity(intent)
        /*}*/
        }

        val logout = this.findViewById<ImageView>(R.id.logout)
        logout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java).apply {
            }
            startActivity(intent)
        }
    }
}