package com.example.agora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    lateinit var signup:Button
    lateinit var signin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        signin=findViewById(R.id.signin)
        signup=findViewById(R.id.signup)
        signup.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        signin.setOnClickListener {
            startActivity(Intent(this,LoginScreen::class.java))
        }
    }
}
