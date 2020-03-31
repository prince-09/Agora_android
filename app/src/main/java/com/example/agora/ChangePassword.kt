package com.example.agora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

class ChangePassword : AppCompatActivity() {
lateinit var changepass:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)
        changepass=findViewById(R.id.gitterlay)
        changepass.setOnClickListener{
            Toast.makeText(this,"Your password has been successfully changed",Toast.LENGTH_SHORT).show()
            finish();
        }
    }
}
