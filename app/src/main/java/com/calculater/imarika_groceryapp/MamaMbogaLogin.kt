package com.calculater.imarika_groceryapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MamaMbogaLogin : AppCompatActivity() {
    lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga_login)
        btnLogin=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent=Intent(this,ProductPage::class.java)
            startActivity(intent)
        }
    }
}