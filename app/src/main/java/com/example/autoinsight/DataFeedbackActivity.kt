package com.example.autoinsight

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class DataFeedbackActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datafeedback)

        val services = resources.getStringArray(R.array.services)
        val arrayAdapterAns: ArrayAdapter<String> = ArrayAdapter(this, R.layout.dropdown, services)
        val ans = findViewById<AutoCompleteTextView>(R.id.ans)
        ans.setAdapter(arrayAdapterAns)

        val fnameyes=findViewById<EditText>(R.id.fnameyes)
        val lnameyes=findViewById<EditText>(R.id.lnameyes)



        // Retrieve the values passed from DataStatusActivity
        val firstName = intent.getStringExtra("firstName")
        val lastName = intent.getStringExtra("lastName")
        val houseNo = intent.getStringExtra("houseNo")
        val city = intent.getStringExtra("city")
        val state = intent.getStringExtra("state")
        val pinCode = intent.getStringExtra("pinCode")
        val mobile = intent.getStringExtra("mobile")
        val email = intent.getStringExtra("email")
        val manufacturer = intent.getStringExtra("manufacturer")
        val carModel = intent.getStringExtra("carModel")
        val fuelType = intent.getStringExtra("fuelType")
        val carSegment = intent.getStringExtra("carSegment")
        val serviceDone = intent.getStringExtra("serviceDone")
        val often = intent.getStringExtra("often")
        val avgRunning = intent.getStringExtra("avgRunning")



        val edit1=findViewById<EditText>(R.id.edit1)
        val edit2=findViewById<EditText>(R.id.edit2)

        ans.setOnItemClickListener { parent, view, position, id ->
          var  selectedText = parent.getItemAtPosition(position).toString()
            if(selectedText=="Yes") {
                     fnameyes.visibility = View.VISIBLE

                lnameyes.visibility = View.VISIBLE

            }
            else{
                selectedText="No"
                fnameyes.visibility = View.GONE

                lnameyes.visibility = View.GONE
            }

        }


        val fnext = this.findViewById<Button>(R.id.submit)
        fnext.setOnClickListener {
            Toast.makeText(this, carSegment, Toast.LENGTH_SHORT).show()
        }


    }
}