package com.example.ncpt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var signInBtn: Button = findViewById(R.id.signinBtn)
        val forgotPwd: TextView = findViewById(R.id.forgotpwd)
        val signupTxt: TextView = findViewById(R.id.signup)

        signupTxt.setOnClickListener {
            val signup_intent = Intent(this, signup::class.java)
            startActivity(signup_intent)
        }

        forgotPwd.setOnClickListener {
            val forgotpwd_intent = Intent(this, forgot_password::class.java)
            startActivity(forgotpwd_intent)
        }

        signInBtn.setOnClickListener {
            var editUsername: EditText = findViewById(R.id.editUsername)
            var editPassword: EditText = findViewById(R.id.editPassword)

//            Toast.makeText(this, "Welcome back " + editUsername.text + "!", Toast.LENGTH_SHORT).show()
            val welcome_intent = Intent(this, welcome_screen::class.java)
            welcome_intent.putExtra("Username", editUsername.text.toString())
                    startActivity(welcome_intent)
        }
    }
}