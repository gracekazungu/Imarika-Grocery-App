package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbutton=findViewById(R.id.btnbutton)
        btnbutton.setOnClickListener {
            val intent=Intent(this,UserLogin::class.java)
            startActivity(intent)
        }
    }
}