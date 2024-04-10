package com.mruraza.food_ordering.splashAndStart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.loginAndSignup.*

class start_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()
        setContentView(R.layout.activity_start)
        val nextbtn = findViewById<Button>(R.id.next_btn_startActivity)
        nextbtn.setOnClickListener {
            val intent = Intent(this,login::class.java);
            startActivity(intent)
            finish()
        }
    }
}