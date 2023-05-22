package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class ProductPage : AppCompatActivity() {
    lateinit var tilPname:TextInputLayout
    lateinit var etPname:TextInputEditText
    lateinit var tilDescription:TextInputLayout
    lateinit var etDescription:TextInputEditText
    lateinit var tilQuantity:TextInputLayout
    lateinit var etQuantity:TextInputEditText
    lateinit var tilPrice:TextInputLayout
    lateinit var etPrice:TextInputEditText
    lateinit var btnUpload:Button
    lateinit var btnOrder:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_page)
        btnUpload=findViewById(R.id.btnUpload)
        btnUpload.setOnClickListener {
            val intent= Intent(this,CustomerProducts::class.java)
            startActivity(intent)
        }
        btnOrder=findViewById(R.id.btnOrder)
        btnOrder.setOnClickListener {
            val intent= Intent(this,OrderDetails::class.java)
            startActivity(intent)
        }



        castViews()
    }
    fun castViews() {
        tilPname = findViewById(R.id.tilPname)
        tilDescription = findViewById(R.id.tilDescription)
        tilQuantity = findViewById(R.id.tilQuantity)
        tilPrice=findViewById(R.id.tilPrice)
        etPname= findViewById(R.id.etPname)
        etDescription = findViewById(R.id.etDescription)
        etQuantity = findViewById(R.id.etQuantity)
        etPrice = findViewById(R.id.etPrice)
    }



//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return super.onOptionsItemSelected(item)
//    }  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//       menuInflater.inflate(R.menu.appmenu,menu)
//        return super.onCreateOptionsMenu(menu)
//    }
}