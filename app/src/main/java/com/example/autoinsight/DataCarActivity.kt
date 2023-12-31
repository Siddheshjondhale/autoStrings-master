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

    private val brands = arrayOf(
        "Tata", "Maruti", "Mahindra", "Hyundai",
        "Toyota", "VW", "Honda", "GM/Chevrolet",
        "BMW", "Mercedes"
    )

    private val modelsMap = mapOf(
        "Tata" to arrayOf("Indica", "Tiago", "Tigor", "Nexon", "Harrier","safari","Altroz","Punch","Zest","Nano","Sierra","Hexa","Aria","Sumo","Estate"),
        "Maruti" to arrayOf("Swift", "Baleno", "Dzire", "WagonR", "Ertiga","Alto","Presso","Versa","Eeco","Brezza","Celerio","Ciaz","Ignis","S cross","XLS","Jumny","Vitara","Invicto","Cresent","Fronx"),
        "Mahindra" to arrayOf("XUV500", "Scorpio", "Thar", "Bolero", "KUV100","XUV300","XUV700","Xylo"),
        "Hyundai" to arrayOf("Creta", "i20", "Venue", "Verna", "Tucson","Accent", "Elentra", "Sonata", "i10", "Xcent", "Eon", "Grand i10", "Alcazar", "Aura"),
        "Honda" to arrayOf( "Amaze", "City", "Civic", "CR-V", "Accord", "Jazz"),
        "VW" to arrayOf("Jetta", "Polo", "Atlas", "Golf", "Touareg", "Tiguan"),
        "Toyota" to arrayOf("Camry", "Qualis", "Innova - Crysta", "Innova", "Corolla"),
        "GM/Chevrolet" to arrayOf("Beat", "Tavera", "Captiva", "Cruze"),
        "BMW" to arrayOf("X1","X3","X5","X7"),
        "Mercedes" to arrayOf("C-Class", "GLA", "S-Class", "E-Class", "A-Class", "GLE", "GLC", "GLS", "G-Class"),



        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datacar)

        /*g = this.findViewById(R.id.manf)
        h = this.findViewById(R.id.model)
        i = this.findViewById(R.id.manfYear)
        l = this.findViewById(R.id.regNo)
        m = this.findViewById(R.id.fuel)*/

        val brandAutoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.manufacturer)
        val modelAutoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.car_model)

        // Populate the brand AutoCompleteTextView
        val brandAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, brands)
        brandAutoCompleteTextView.setAdapter(brandAdapter)

        // Set an item click listener for the brand AutoCompleteTextView
        brandAutoCompleteTextView.setOnItemClickListener { _, _, position, _ ->
            val selectedBrand = brands[position]
            val modelsForBrand = modelsMap[selectedBrand] ?: emptyArray()

            // Populate the model AutoCompleteTextView with models for the selected brand
            val modelAdapter =
                ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, modelsForBrand)
            modelAutoCompleteTextView.setAdapter(modelAdapter)


            val fuelType = resources.getStringArray(R.array.fuelType)
            val arrayAdapterFuel: ArrayAdapter<String> =
                ArrayAdapter(this, R.layout.dropdown, fuelType)
            val fuel = findViewById<AutoCompleteTextView>(R.id.fuel)
            fuel.setAdapter(arrayAdapterFuel)

            val carSegment = resources.getStringArray(R.array.carSegment)
            val arrayAdapterSegment: ArrayAdapter<String> =
                ArrayAdapter(this, R.layout.dropdown, carSegment)
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
}