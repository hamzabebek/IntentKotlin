package com.example.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
    }
    fun info(view: View){
        val infoIntent = intent
        var username = intent.getStringExtra("username")
        var pass = intent.getStringExtra("pass")
        textView.text = "Your username : $username"
        textView2.text = "Your Pass : $pass"
    }
    fun back(view: View){
        var intentBack = Intent(applicationContext,MainActivity::class.java)
        startActivity(intentBack)
    }
}