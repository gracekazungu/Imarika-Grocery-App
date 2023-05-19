package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CustomerLogin : AppCompatActivity() {
    lateinit var tilTextview: TextInputLayout
    lateinit var etUsername: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var button6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_login)
        castViews()
    }
    override fun onResume() {
        super.onResume()
        button6.setOnClickListener {
            val intent = Intent(this,CustomerProducts::class.java)
            startActivity(intent)
            validateLogin()
            clearErrors()
        }
    }

    fun castViews() {
        tilPassword = findViewById(R.id.tilPassword)
        etPassword = findViewById(R.id.etPassword)
        button6 = findViewById(R.id.button6)
    }

    fun validateLogin() {
        val username = etUsername.text.toString()
        val password = etPassword.text.toString()
        var error = false

        if (username.isBlank()) {
            tilTextview.error = "username is required"
            error = true
        }


        if (password.isBlank()) {
            tilPassword.error = "Password is required"
            error = true
        }
        if (password.length < 8) {
            tilPassword.error = "Password should contain more than 8 characters"
            error = true
        }

        if (!error) {
            Toast.makeText(this, "Hello $username,thankyou for signing up to this app", Toast.LENGTH_LONG).show()
        }

    }

    fun clearErrors() {
        tilTextview.error = null
        tilPassword.error = null
    }
}