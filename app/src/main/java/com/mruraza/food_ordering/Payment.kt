package com.mruraza.food_ordering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.mruraza.food_ordering.fragments.PaymentBottomSheetDialog

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        val back_btn = findViewById<ImageButton>(R.id.back_btn_payment)
        back_btn.setOnClickListener {
            finish()
        }

        val placeMyOrder = findViewById<Button>(R.id.btn_to_placeMyOrderPayment)
        placeMyOrder.setOnClickListener {
            val btmSheetDialog = PaymentBottomSheetDialog()
            btmSheetDialog.show(supportFragmentManager,"task")
        }


    }
}