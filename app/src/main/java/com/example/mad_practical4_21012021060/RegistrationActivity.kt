package com.example.mad_practical4_21012021060

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val logintxt:TextView=findViewById(R.id.txtlogin)
        logintxt.setOnClickListener {
            Intent(this@RegistrationActivity,LoginActivity::class.java).also {
                startActivity(it)
            }
        }

     val registerbtn:Button = findViewById(R.id.regbtn)

        registerbtn.setOnClickListener {
            Toast.makeText(this@RegistrationActivity,"Registered successfully",Toast.LENGTH_LONG).show()

            Intent(this@RegistrationActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}