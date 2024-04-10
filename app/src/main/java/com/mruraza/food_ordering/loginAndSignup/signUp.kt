package com.mruraza.food_ordering.loginAndSignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.widget.TextView
import com.mruraza.food_ordering.R

class signUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val alreadyAccTv = findViewById<TextView>(R.id.alreadyHaveAnAccountTVSignUpPage)
        alreadyAccTv.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}