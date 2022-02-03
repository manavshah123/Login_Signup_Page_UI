package com.example.twoday_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.textfield.TextInputEditText

class Login_activity : AppCompatActivity() {

    private lateinit var username : TextInputEditText
    private lateinit var password : TextInputEditText
    private lateinit var login : ImageButton
    private lateinit var signup : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val logincard = findViewById<CardView>(R.id.login_card)
        logincard.setBackgroundResource(R.drawable.cardback_login)

        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        login = findViewById(R.id.Signin_button)
        signup = findViewById(R.id.signup)

        login.setOnClickListener {
            val userinput = username.text.toString()
            val passinput =password.text.toString()

            checkcredential(userinput, passinput)
        }
        signup.setOnClickListener {
            val intent = Intent(this, signup_activity::class.java)
            startActivity(intent)
        }

    }

    private fun checkcredential(userinput: String, passinput: String) {
        if (userinput == "manav@gmail.com" && passinput == "manavshah"){
            Toast.makeText(this,"Login successfully", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Home_Activity::class.java)
            intent.putExtra("Name"," $userinput")
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Wrong Credential",Toast.LENGTH_LONG).show()
        }
    }
}