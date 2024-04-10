package com.mruraza.food_ordering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mruraza.food_ordering.fragments.NotificationBottomSheet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        var navcontroller = findNavController(R.id.fragmentContainerView)
        var btmnav = findViewById<BottomNavigationView>(R.id.btm_nav_mainActvt)
        btmnav.setupWithNavController(navcontroller)


        val notificationn : ImageView = findViewById(R.id.notification_icon_IV)
        notificationn.setOnClickListener {
            val btnsheetDialog = NotificationBottomSheet()
            btnsheetDialog.show(supportFragmentManager,"test")
        }


    }
}