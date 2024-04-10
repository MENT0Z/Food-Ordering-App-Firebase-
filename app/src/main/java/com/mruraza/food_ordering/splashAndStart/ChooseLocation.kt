package com.mruraza.food_ordering.splashAndStart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import com.mruraza.food_ordering.MainActivity
import com.mruraza.food_ordering.R

class ChooseLocation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_location)

        val choselocn = findViewById<AutoCompleteTextView>(R.id.list_of_locn_autoCompleteLocnActvt)
        val locnList = arrayOf("Kathmandu","Lalitpur","Bhaktpur","Chitwan","Dhangadhi","Mahendranagar");

        val adaptor = ArrayAdapter(this,android.R.layout.simple_list_item_1,locnList)
        choselocn.setAdapter(adaptor)

        val continueBtn = findViewById<Button>(R.id.continue_btn_in_locn)
        continueBtn.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}