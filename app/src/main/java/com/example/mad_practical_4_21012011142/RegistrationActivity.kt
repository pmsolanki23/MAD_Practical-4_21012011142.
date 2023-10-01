package com.example.mad_practical_4_21012011142

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val Login: Button = findViewById(R.id.button)

        Login.setOnClickListener {
            Intent(this@RegisterActivity, LoginActivity::class.java).also { startActivity(it) }
        }

    }
}