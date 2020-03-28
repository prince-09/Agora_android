package com.example.agora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        var login = findViewById<Button>(R.id.loginbtn);
        var signup=findViewById<Button>(R.id.signup);
        login.setOnClickListener {
            startActivity(Intent(this,HomePage::class.java))
         }
        signup.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
         }
    }
}
