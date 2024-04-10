package com.mruraza.food_ordering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class FoodDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        val btntoback = findViewById<ImageButton>(R.id.imageBtnToBackFoodDetailsActivity)
        btntoback.setOnClickListener {
            finish();
        }


        val foodName = intent.getStringExtra("ItemName")
        val foodImage = intent.getIntExtra("ItemImage",0);

        val foodname = findViewById<TextView>(R.id.foodNameTVFoodDetails)
        val foodimage = findViewById<ImageView>(R.id.PictureOfFoodFOodDetails)

        foodname.text = foodName
        foodimage.setImageResource(foodImage)

    }
}