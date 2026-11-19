package com.example.myapplications

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_login)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val intent = Intent(this, MainFeatureActivity::class.java)
            startActivity(intent)
        }
    }
}
