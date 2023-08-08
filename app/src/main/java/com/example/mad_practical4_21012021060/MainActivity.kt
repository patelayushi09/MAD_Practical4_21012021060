package com.example.mad_practical4_21012021060

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val loginbutton:Button=findViewById(R.id.loginbtn)
        val signupbutton:Button=findViewById(R.id.signupbtn)

        loginbutton.setOnClickListener {
            Intent(this@MainActivity,LoginActivity::class.java).also {
                startActivity(it)
            }
        }

        signupbutton.setOnClickListener {
            Intent(this@MainActivity,RegistrationActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}