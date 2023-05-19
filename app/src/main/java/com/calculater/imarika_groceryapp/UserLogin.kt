package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserLogin : AppCompatActivity() {
    lateinit var btnbutton2: Button
    lateinit var btnbutton3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
        btnbutton2=findViewById(R.id.btnbutton2)
        btnbutton3=findViewById(R.id.btnbutton3)

        btnbutton2.setOnClickListener {
            val intent= Intent(this,MamaMbogaReg::class.java)
            startActivity(intent)
        }
        btnbutton3.setOnClickListener {
            val intent=Intent(this,CustomerReg::class.java)
            startActivity(intent)
        }
    }
}