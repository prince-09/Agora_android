package com.example.agora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddCandidates : AppCompatActivity() {
    lateinit var proceed:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_candidates)
        proceed=findViewById(R.id.proceed)
        proceed.setOnClickListener {

        }
    }
}
