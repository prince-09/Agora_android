package com.example.agora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Gitter : AppCompatActivity() {
lateinit var webview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gitter)
        webview=findViewById(R.id.web)
        webview.loadUrl("https://gitter.im/AOSSIE/Agora-Android")
    }
}
