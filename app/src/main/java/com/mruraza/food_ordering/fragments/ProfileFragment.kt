package com.mruraza.food_ordering.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.findFragment
import com.mruraza.food_ordering.R

class ProfileFragment : Fragment() {
   private lateinit var view: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile, container, false)

        val savebtn:Button = view.findViewById(R.id.save_infobtn)
        savebtn.setOnClickListener{
            lateinit var name:String
            lateinit var address : String
            lateinit var phone : String
            lateinit var email:String
            val nameet = view.findViewById<EditText>(R.id.nameETProfile)
            val addresss = view.findViewById<EditText>(R.id.AddressETProfile)
            val emaill = view.findViewById<EditText>(R.id.emailETprofile)
            val phoneeee = view.findViewById<EditText>(R.id.phoneETprofile)
            if(nameet.text.isEmpty()){
                nameet.error = "Name Can't Be Empty"
            }else{
                name = nameet.text.toString().trim()
            }
            if(addresss.text.isEmpty()){
                address = ""
            }else{
                address = addresss.text.toString().trim()
            }
            if(emaill.text.isEmpty()){
                emaill.error = "Email Can't be empty"
            }else{
                email = emaill.text.toString()
            }
            if(phoneeee.text.isEmpty()){
                phoneeee.error = "This Field Cant be empty"
            }else{
                phone = phoneeee.text.toString()
            }


            if(!nameet.text.isEmpty() && emaill.text.isEmpty()&& !phoneeee.text.isEmpty()){
                nameet.setText(name)
                addresss.setText(address)
                emaill.setText(email)
                phoneeee.setText(phone)

            }

        }



        return view
    }


}