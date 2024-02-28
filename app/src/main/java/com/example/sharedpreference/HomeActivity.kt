package com.example.sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logoutButton: Button = findViewById(R.id.btnLogout)

        logoutButton.setOnClickListener {
            val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putBoolean("flag", false)
            editor.apply()
        }
    }
}