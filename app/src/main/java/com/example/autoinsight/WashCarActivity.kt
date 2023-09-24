package com.example.autoinsight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.ImageView

class WashCarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_washcar)

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
            val intent = Intent(this, WashPlanActivity::class.java).apply {
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