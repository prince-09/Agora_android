package com.example.agora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

class ChangeEmail : AppCompatActivity() {
lateinit var changemail:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_email)
        changemail=findViewById(R.id.gitterlay)
        changemail.setOnClickListener{
            Toast.makeText(this,"Your email has been successfully changed", Toast.LENGTH_SHORT).show()
            finish();
        }
    }
}
