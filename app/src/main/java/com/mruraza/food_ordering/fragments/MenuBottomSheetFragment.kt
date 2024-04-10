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
import com.mruraza.food_ordering.adaptors.MenuAdaptor
import com.mruraza.food_ordering.modals.Menu


class MenuBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var view: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_menu_bottom_sheet, container, false)

        val backarrw : ImageButton = view.findViewById(R.id.back_btn_menu)
        backarrw.setOnClickListener{
            dismiss()
        }
        val recyclerView : RecyclerView = view.findViewById(R.id.recycler_view_of_menu)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val mylist = ArrayList<Menu>()
        mylist.add(Menu(R.drawable.thakali,"Thakali","120"))
        mylist.add(Menu(R.drawable.yomari,"Yomari","100"))
        mylist.add(Menu(R.drawable.momo,"Momo","180"))
        mylist.add(Menu(R.drawable.sel_roti,"SelRoti","220"))
        mylist.add(Menu(R.drawable.thakali,"Thakali","120"))
        mylist.add(Menu(R.drawable.yomari,"Yomari","100"))
        mylist.add(Menu(R.drawable.momo,"Momo","180"))
        mylist.add(Menu(R.drawable.sel_roti,"SelRoti","220"))
        mylist.add(Menu(R.drawable.thakali,"Thakali","120"))
        mylist.add(Menu(R.drawable.yomari,"Yomari","100"))
        mylist.add(Menu(R.drawable.momo,"Momo","180"))
        mylist.add(Menu(R.drawable.sel_roti,"SelRoti","220"))
        val adaptor = MenuAdaptor(mylist,requireContext())
        recyclerView.adapter = adaptor


        return view
    }

}