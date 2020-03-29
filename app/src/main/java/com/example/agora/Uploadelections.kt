package com.example.agora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Uploadelections : AppCompatActivity() {
    lateinit var proceed:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uploadelections)
        proceed=findViewById(R.id.proceed)
        proceed.setOnClickListener {
            startActivity(Intent(this,AddCandidates::class.java))
        }
    }
}
