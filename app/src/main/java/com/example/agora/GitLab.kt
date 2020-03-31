package com.example.agora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class GitLab : AppCompatActivity() {
    lateinit var webview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_lab)
        webview=findViewById(R.id.web)
        webview.loadUrl("https://gitlab.com/aossie/agora-android")
    }
}
