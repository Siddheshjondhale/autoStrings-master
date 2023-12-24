package com.example.autoinsight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val services = resources.getStringArray(R.array.services)
        val arrayAdapterAns: ArrayAdapter<String> = ArrayAdapter(this, R.layout.dropdown, services)
        val ans = findViewById<AutoCompleteTextView>(R.id.ans)
        ans.setAdapter(arrayAdapterAns)

        val submitButton = this.findViewById<Button>(R.id.submitButton)

        submitButton.visibility = View.GONE

        var selectedText = ""

        ans.setOnItemClickListener { parent, view, position, id ->
            selectedText = parent.getItemAtPosition(position).toString()
            if (selectedText == "Yes") {
                submitButton.visibility = View.VISIBLE
            } else {
                selectedText = "No"
                submitButton.visibility = View.GONE

            }
        }

        var obtainedPlan: String

        val displayPlan = this.findViewById<TextView>(R.id.displayPlan)
        obtainedPlan = intent.getStringExtra("planSelected").toString()

        displayPlan.text = " Your Selected Plan: ₹" + obtainedPlan

        
    }
}