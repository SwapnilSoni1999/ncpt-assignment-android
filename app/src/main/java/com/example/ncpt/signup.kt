package com.example.ncpt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val signupBtn = findViewById<Button>(R.id.signupBtn)
        val usernameTxt = findViewById<EditText>(R.id.editTextTextPersonName)

        signupBtn.setOnClickListener {
            val welcome_intent = Intent(this, welcome_screen::class.java)
            welcome_intent.putExtra("Username", usernameTxt.text.toString())
            startActivity(welcome_intent)
        }
    }
}