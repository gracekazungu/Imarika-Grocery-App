package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MamaMbogaReg : AppCompatActivity() {
    lateinit var button2: Button
    lateinit var tv_login: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga_reg)
        button2=findViewById(R.id.button2)
        tv_login=findViewById(R.id.tv_login)
        button2.setOnClickListener {
            val intent=Intent(this,ProductPage::class.java)
            startActivity(intent)
        }
        tv_login.setOnClickListener {
            val intent=Intent(this,MamaMbogaLogin::class.java)
            startActivity(intent)
        }
    }
}