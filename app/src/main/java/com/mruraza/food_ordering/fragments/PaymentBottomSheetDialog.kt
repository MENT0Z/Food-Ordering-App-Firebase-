package com.mruraza.food_ordering.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.mruraza.food_ordering.MainActivity
import com.mruraza.food_ordering.R


class PaymentBottomSheetDialog :BottomSheetDialogFragment() {
     private lateinit var view: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        view =  inflater.inflate(R.layout.fragment_payment_bottom_sheet_dialog, container, false)

        val btnToGoBack = view.findViewById<Button>(R.id.go_home_btn_paymentBtmSheet)

        btnToGoBack.setOnClickListener {
            val intent = Intent(requireContext(),MainActivity::class.java)
            startActivity(intent)
            dismiss()
        }

        return  view
    }


}