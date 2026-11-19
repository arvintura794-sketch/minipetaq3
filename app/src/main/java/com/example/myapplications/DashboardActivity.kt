package com.example.myapplications

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUserRow(R.id.row1, "Luna Valeria", "Pilot G tech 0.4")
        setupUserRow(R.id.row2, "Ashianna Kim Fernandez", "Valeria small claw clip")
        setupUserRow(R.id.row3, "Amora Elyse Ledezma", "Atomic Habits book")
        setupUserRow(R.id.row4, "Sebastian Vincent Camero", "Grey face towel")
        setupUserRow(R.id.row5, "Samantha Maureen Vera", "Cartier classic love bracelet")
        setupUserRow(R.id.row6, "Avianna Rye Diaz", "Pilot G tech 0.4")
    }

    private fun setupUserRow(rowId: Int, userName: String, itemName: String) {
        findViewById<View>(rowId).setOnClickListener {
            val intent = Intent(this, MessengerActivity::class.java).apply {
                putExtra("USER_NAME", userName)
                putExtra("ITEM_NAME", itemName)
            }
            startActivity(intent)
        }
    }
}
