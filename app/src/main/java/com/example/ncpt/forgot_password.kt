package com.example.ncpt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class forgot_password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val contBtn = findViewById<Button>(R.id.continueBtn)
        contBtn.setOnClickListener{
            val main_intent = Intent(this, MainActivity::class.java)
            startActivity(main_intent)
        }
    }
}