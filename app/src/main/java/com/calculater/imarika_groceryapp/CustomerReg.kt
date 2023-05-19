package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CustomerReg : AppCompatActivity() {
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_reg)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)
        button7=findViewById(R.id.button7)

        button3.setOnClickListener {
            val intent= Intent(this,CustomerLogin::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent= Intent(this,CustomerSognup::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}