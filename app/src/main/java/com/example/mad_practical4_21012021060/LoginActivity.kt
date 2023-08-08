package com.example.mad_practical4_21012021060

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signuptxt:TextView=findViewById(R.id.txtsign)
        signuptxt.setOnClickListener {
            Intent(this@LoginActivity,RegistrationActivity::class.java).also {
                startActivity(it)
            }
        }

        val loginButton:Button=findViewById(R.id.loginbtn)
        loginButton.setOnClickListener {
            Toast.makeText(this@LoginActivity,"Login Successfully",Toast.LENGTH_LONG).show()
        }
    }
}