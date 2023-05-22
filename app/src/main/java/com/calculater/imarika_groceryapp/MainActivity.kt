package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.calculater.imarika_groceryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }

    override fun onResume() {
        super.onResume()
        binding.btnbutton.setOnClickListener {
            val intent=Intent(this,UserLogin::class.java)
            startActivity(intent)
    }
    }
}