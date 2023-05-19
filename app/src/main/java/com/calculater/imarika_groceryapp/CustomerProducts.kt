package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CustomerProducts : AppCompatActivity() {
    lateinit var btn_AddtoCart:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_products)
        btn_AddtoCart =findViewById(R.id.btn_AddtoCart)
        btn_AddtoCart.setOnClickListener {
            val intent=Intent(this,AddCart::class.java)
            startActivity(intent)
        }
    }
}