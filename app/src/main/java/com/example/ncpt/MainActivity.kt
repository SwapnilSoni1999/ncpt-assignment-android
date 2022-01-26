package com.example.ncpt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var signInBtn: Button = findViewById(R.id.signinBtn)

        signInBtn.setOnClickListener {
            var editUsername: EditText = findViewById(R.id.editUsername)
            var editPassword: EditText = findViewById(R.id.editPassword)

            Toast.makeText(this, "Welcome back " + editUsername.text + "!", Toast.LENGTH_SHORT).show()
        }
    }
}