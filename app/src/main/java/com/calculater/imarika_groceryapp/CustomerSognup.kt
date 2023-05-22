package com.calculater.imarika_groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.calculater.imarika_groceryapp.databinding.ActivityCustomerSognupBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CustomerSognup : AppCompatActivity() {
    lateinit var binding:ActivityCustomerSognupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCustomerSognupBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        binding.btnbutton8.setOnClickListener {
            val intent=Intent(this,CustomerProducts::class.java)
            startActivity(intent)
            clearErrors()
            validateSignup()
        }
    }

    fun validateSignup() {
        val FullName = binding.etFullName.text.toString()
        val Email = binding.etEmail.text.toString()
        val Password = binding.etPassword.text.toString()
        val Confirmation = binding.etConfirmPassword.text.toString()
        var error = false

        if (FullName.isBlank()) {
           binding.tilFullName.error = "Full name is required"
            error = true
        }
        if (Email.isBlank()) {
           binding.tilEmail.error = "Email is required"
            error = true
        }

        if (Password.isBlank()) {
            binding.tilPassword.error = "Password is required"
            error = true
        }
        if (Password.length < 8) {
            binding.tilPassword.error = "Password should contain more than 8 characters"
            error = true
        }
        if (Confirmation.isBlank()) {
            binding.tilConfirmPassword.error = "Password need confirmation"
        }
        if (Confirmation != Password) {
            binding.tilConfirmPassword.error = "Password and confirmation do not match"
            error = true
        }
        if (!error) {
            Toast.makeText(this, "Hello $FullName,thankyou for signing up to this app", Toast.LENGTH_LONG).show()
        }
    }

    fun clearErrors() {
        binding.tilFullName.error = null
        binding.tilEmail.error = null
        binding.tilPassword.error = null
        binding.tilConfirmPassword.error = null
    }

}