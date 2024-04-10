package com.mruraza.food_ordering.loginAndSignup

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.splashAndStart.ChooseLocation

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val supportActionBar = supportActionBar
        val colorr = ColorDrawable(Color.parseColor("#F48107"))
        supportActionBar?.setBackgroundDrawable(colorr)


        val dontHaveAcc = findViewById<TextView>(R.id.TV_dont_have_account)
        dontHaveAcc.setOnClickListener{
            intent = Intent(this,signUp::class.java)
            startActivity(intent)
        }

        val loginBtn = findViewById<Button>(R.id.login_btn_loginPage)
        loginBtn.setOnClickListener{
            val intent = Intent(this,ChooseLocation::class.java)
            startActivity(intent)
        }


    }
}