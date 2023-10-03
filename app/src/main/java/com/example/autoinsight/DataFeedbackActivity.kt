package com.example.autoinsight

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.EditText

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

        ans.setOnItemClickListener { parent, view, position, id ->
          var  selectedText = parent.getItemAtPosition(position).toString()
            if(selectedText=="Yes") {
//                wherelayout.visibility= View.VISIBLE
//
//
//                whenlayout.visibility = View.GONE

            }
            else{
                selectedText="No"
                fnameyes.visibility = View.GONE

                lnameyes.visibility = View.GONE
            }

        }




    }
}