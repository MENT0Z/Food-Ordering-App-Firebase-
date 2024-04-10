package com.mruraza.food_ordering.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.adaptors.HistoryAdaptor
import com.mruraza.food_ordering.modals.HistoryItems


class HistoryFragment : Fragment() {
   private lateinit var view: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_history, container, false)


        val mylist = ArrayList<HistoryItems>()
        mylist.add(HistoryItems(R.drawable.thakali,"Thakali","120"))
        mylist.add(HistoryItems(R.drawable.yomari,"Yomari","100"))
        mylist.add(HistoryItems(R.drawable.momo,"Momo","180"))
        mylist.add(HistoryItems(R.drawable.sel_roti,"SelRoti","220"))
        mylist.add(HistoryItems(R.drawable.thakali,"Thakali","120"))
        mylist.add(HistoryItems(R.drawable.yomari,"Yomari","100"))
        mylist.add(HistoryItems(R.drawable.momo,"Momo","180"))
        mylist.add(HistoryItems(R.drawable.sel_roti,"SelRoti","220"))
        mylist.add(HistoryItems(R.drawable.thakali,"Thakali","120"))
        mylist.add(HistoryItems(R.drawable.yomari,"Yomari","100"))
        mylist.add(HistoryItems(R.drawable.momo,"Momo","180"))
        mylist.add(HistoryItems(R.drawable.sel_roti,"SelRoti","220"))

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view_history_previous)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adaptor=HistoryAdaptor(mylist,requireContext())
        recyclerView.adapter = adaptor






        return view
    }


}