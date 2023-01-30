package com.example.day2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val intent = intent

        val email = intent.getStringExtra("email")
        val pass = intent.getStringExtra("pass")
        tv1.setText(email)
        tv2.setText(pass)
    }
}