package com.example.agora

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

class Uploadelections : AppCompatActivity() {
    lateinit var proceed:Button
    lateinit var startdate: TextView
    lateinit var enddate:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uploadelections)
        startdate=findViewById(R.id.startdate)
        enddate=findViewById(R.id.enddate)
        proceed=findViewById(R.id.proceed)
        proceed.setOnClickListener {
            startActivity(Intent(this,AddCandidates::class.java))
        }
        startdate.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)


            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                // Display Selected date in textbox
                startdate.setText("" + dayOfMonth + " " + monthOfYear + ", " + year)
            }, year, month, day)

            dpd.show()
        }
        enddate.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)


            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                // Display Selected date in textbox
                enddate.setText("" + dayOfMonth + " " + monthOfYear + ", " + year)
            }, year, month, day)

            dpd.show()
        }
    }
}
