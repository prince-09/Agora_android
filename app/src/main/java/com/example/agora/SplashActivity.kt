package com.example.agora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat

class SplashActivity : AppCompatActivity() {
    lateinit var agora:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        agora=findViewById(R.id.imageView)
        var animate:Animation
        animate=AnimationUtils
                .loadAnimation(this,R.anim.rotate)
        agora.startAnimation(animate)
        Handler().postDelayed(
                {
                    val i = Intent(this, LoginScreen::class.java)
                    var options:ActivityOptionsCompat
                    options= ActivityOptionsCompat.makeSceneTransitionAnimation(this,agora,"go")
                    startActivity(i,options.toBundle())
                    finish()
                }, 3000)
    }
}
