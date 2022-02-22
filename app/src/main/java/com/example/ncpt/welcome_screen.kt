package com.example.ncpt

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class welcome_screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)
        val username = intent.getStringExtra("Username").toString()
        val welcm = findViewById<TextView>(R.id.welcomeTxt)
        welcm.setText("Welcome " + username)
    }
}