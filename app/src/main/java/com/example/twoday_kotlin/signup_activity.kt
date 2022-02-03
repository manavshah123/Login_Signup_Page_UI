package com.example.twoday_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.textfield.TextInputEditText

class signup_activity : AppCompatActivity() {

    private lateinit var name : TextInputEditText
    private lateinit var username : TextInputEditText
    private lateinit var password : TextInputEditText
    private lateinit var register : ImageButton
    private lateinit var signin : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val logincard = findViewById<CardView>(R.id.login_card)
        logincard.setBackgroundResource(R.drawable.cardback_login)

        name = findViewById(R.id.fullname)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        register = findViewById(R.id.Signup_button)
        signin = findViewById(R.id.sigin)

        register.setOnClickListener {
            val usersname = name.text.toString()
            val userinput = username.text.toString()
            val passinput =password.text.toString()
             homescreen(usersname)

        }
        signin.setOnClickListener {
            val intent = Intent(this, Login_activity::class.java)
            startActivity(intent)
        }

    }

    private fun homescreen(usersname: String) {
        val intent = Intent(this, Home_Activity::class.java)
        intent.putExtra("Name"," $usersname")
        startActivity(intent)
        Toast.makeText(this,"Account created successfully", Toast.LENGTH_LONG).show()
    }
}