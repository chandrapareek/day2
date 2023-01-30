package com.example.day2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    lateinit var etemail:EditText
    lateinit var etpass:EditText
    lateinit var btnsubmit: Button
    lateinit var email:String
    lateinit var pass:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etemail = findViewById(R.id.etemail)
        etpass = findViewById(R.id.etpass)
        btnsubmit = findViewById(R.id.btnsubmit)


        btnsubmit.setOnClickListener {
            if(check_email()){
                val intent = Intent(this, ActivityB::class.java)
                intent.putExtra("email",email)
                intent.putExtra("pass",pass)
                startActivity(intent)
            }

        }

    }

    private fun check_email(): Boolean {

        email = etemail.text.toString()
        pass = etpass.text.toString()
            if(email.isEmpty() || pass.isEmpty()){
                Toast.makeText(applicationContext,"Email or Password can't be null", Toast.LENGTH_SHORT).show()
                return false
            }

        else if(!email.contains("@")){
            Toast.makeText(applicationContext,"Email should contain @ ",Toast.LENGTH_SHORT).show()
            return false
        }

        return true

    }
}