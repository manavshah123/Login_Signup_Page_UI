package com.example.twoday_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home_Activity : AppCompatActivity() {

    private  lateinit var welcomemsg: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        welcomemsg = findViewById(R.id.textView9)

        val name = intent.getStringExtra("Name")
        welcomemsg.text = "Welcome $name"
    }
}