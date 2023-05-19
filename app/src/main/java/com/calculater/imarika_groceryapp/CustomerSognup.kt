package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CustomerSognup : AppCompatActivity() {
    lateinit var tilFullName: TextInputLayout
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var tilConfirmPassword: TextInputLayout
    lateinit var etFullName: TextInputEditText
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var etConfirmPassword: TextInputEditText
    lateinit var btnbutton8: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_sognup)
        castViews()
    }
    override fun onResume() {
        super.onResume()
        btnbutton8.setOnClickListener {
            val intent=Intent(this,CustomerProducts::class.java)
            startActivity(intent)
            clearErrors()
            validateSignup()
        }
    }

    fun castViews() {
        tilFullName = findViewById(R.id.tilFullName)
        tilEmail = findViewById(R.id.tilEmail)
        tilPassword = findViewById(R.id.tilPassword)
        tilConfirmPassword = findViewById(R.id.tilConfirmPassword)
        etFullName = findViewById(R.id.etFullName)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        btnbutton8 = findViewById(R.id.btnbutton8)
    }

    fun validateSignup() {
        val FullName = etFullName.text.toString()
        val Email = etEmail.text.toString()
        val Password = etPassword.text.toString()
        val Confirmation = etConfirmPassword.text.toString()
        var error = false

        if (FullName.isBlank()) {
            tilFullName.error = "Full name is required"
            error = true
        }
        if (Email.isBlank()) {
            tilEmail.error = "Email is required"
            error = true
        }

        if (Password.isBlank()) {
            tilPassword.error = "Password is required"
            error = true
        }
        if (Password.length < 8) {
            tilPassword.error = "Password should contain more than 8 characters"
            error = true
        }
        if (Confirmation.isBlank()) {
            tilConfirmPassword.error = "Password need confirmation"
        }
        if (Confirmation != Password) {
            tilConfirmPassword.error = "Password and confirmation do not match"
            error = true
        }
        if (!error) {
            Toast.makeText(this, "Hello $FullName,thankyou for signing up to this app", Toast.LENGTH_LONG).show()
        }
    }

    fun clearErrors() {
        tilFullName.error = null
        tilEmail.error = null
        tilPassword.error = null
        tilConfirmPassword.error = null
    }

}