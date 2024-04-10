package com.mruraza.food_ordering.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.adaptors.NotificationAdaptor
import com.mruraza.food_ordering.modals.Notification


class NotificationBottomSheet : BottomSheetDialogFragment() {
    private lateinit var view: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_notification_bottom_sheet, container, false)

        val backbtn:ImageButton = view.findViewById(R.id.back_btn_notifications)
        backbtn.setOnClickListener {
            dismiss()
        }

        val listt = ArrayList<Notification>()
        listt.add(Notification(R.drawable.thakali,"wow lets try thakali is yummy"))
        listt.add(Notification(R.drawable.momo,"wow lets try momo is yummy"))
        listt.add(Notification(R.drawable.sel_roti,"wow lets try selroti is yummy"))
        listt.add(Notification(R.drawable.yomari,"wow lets try yomari is yummy"))
        listt.add(Notification(R.drawable.thakali,"wow lets try thakali is yummy"))
        listt.add(Notification(R.drawable.momo,"wow lets try momo is yummy"))
        listt.add(Notification(R.drawable.sel_roti,"wow lets try selroti is yummy"))
        listt.add(Notification(R.drawable.yomari,"wow lets try yomari is yummy"))
        listt.add(Notification(R.drawable.thakali,"wow lets try thakali is yummy"))
        listt.add(Notification(R.drawable.momo,"wow lets try momo is yummy"))
        listt.add(Notification(R.drawable.sel_roti,"wow lets try selroti is yummy"))
        listt.add(Notification(R.drawable.yomari,"wow lets try yomari is yummy"))
        listt.add(Notification(R.drawable.thakali,"wow lets try thakali is yummy"))
        listt.add(Notification(R.drawable.momo,"wow lets try momo is yummy"))
        listt.add(Notification(R.drawable.sel_roti,"wow lets try selroti is yummy"))
        listt.add(Notification(R.drawable.yomari,"wow lets try yomari is yummy"))

        val recyclerView:RecyclerView = view.findViewById(R.id.recyclerNotification)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adaptor = NotificationAdaptor(listt)
        recyclerView.adapter = adaptor


        return view
    }


}