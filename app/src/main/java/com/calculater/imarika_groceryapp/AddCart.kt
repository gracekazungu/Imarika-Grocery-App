package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddCart : AppCompatActivity() {
    lateinit var btnBuy: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_cart)
        btnBuy=findViewById(R.id.btnBuy)
        btnBuy.setOnClickListener {
            val intent=Intent(this,Payment::class.java)
            startActivity(intent)
        }
    }
}