package com.calculater.imarika_groceryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class ProductPage : AppCompatActivity() {
    lateinit var tilName:TextInputLayout
    lateinit var etName:TextInputEditText
    lateinit var tilDescription:TextInputLayout
    lateinit var etDescription:TextInputEditText
    lateinit var tilCategory:TextInputLayout
    lateinit var etCategory:TextInputEditText
    lateinit var tilQuantity:TextInputLayout
    lateinit var etQuantity:TextInputEditText
    lateinit var tilPrice:TextInputLayout
    lateinit var etPrice:TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_page)
        castViews()
    }
    fun castViews() {
        tilName = findViewById(R.id.tilName)
        tilDescription = findViewById(R.id.tilDescription)
        tilCategory = findViewById(R.id.tilCategory)
        tilQuantity = findViewById(R.id.tilQuantity)
        tilPrice=findViewById(R.id.tilPrice)
        etName = findViewById(R.id.etName)
        etDescription = findViewById(R.id.etDescription)
        etCategory = findViewById(R.id.etCategory)
        etQuantity = findViewById(R.id.etQuantity)
        etPrice = findViewById(R.id.etPrice)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.appmenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}