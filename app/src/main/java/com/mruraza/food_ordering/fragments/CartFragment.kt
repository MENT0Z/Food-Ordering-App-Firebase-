package com.mruraza.food_ordering.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mruraza.food_ordering.Payment
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.adaptors.cartAdaptor
import com.mruraza.food_ordering.modals.CartItems


class CartFragment : Fragment() {
    private lateinit var view: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_cart, container, false)

        // st coding


        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_cart)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val list = ArrayList<CartItems>()
        list.add(CartItems(R.drawable.momo,"Momo","120",1))
        list.add(CartItems(R.drawable.thakali,"Thakali","370",1))
        list.add(CartItems(R.drawable.sel_roti,"Sel Roti","100",1))
        list.add(CartItems(R.drawable.yomari,"Yomari","80",1))
        list.add(CartItems(R.drawable.momo,"Momo","120",1))
        list.add(CartItems(R.drawable.thakali,"Thakali","370",1))
        list.add(CartItems(R.drawable.sel_roti,"Sel Roti","100",1))
        list.add(CartItems(R.drawable.yomari,"Yomari","80",1))
        list.add(CartItems(R.drawable.momo,"Momo","120",1))
        list.add(CartItems(R.drawable.thakali,"Thakali","370",1))
        list.add(CartItems(R.drawable.sel_roti,"Sel Roti","100",1))
        list.add(CartItems(R.drawable.yomari,"Yomari","80",1))
        list.add(CartItems(R.drawable.momo,"Momo","120",1))
        list.add(CartItems(R.drawable.thakali,"Thakali","370",1))
        list.add(CartItems(R.drawable.sel_roti,"Sel Roti","100",1))
        list.add(CartItems(R.drawable.yomari,"Yomari","80",1))
        val adaptor = cartAdaptor(list,requireContext())
        recyclerView.adapter = adaptor


        val cartproceed = view.findViewById<Button>(R.id.cartProceed)
        cartproceed.setOnClickListener {
            val intent = Intent(requireContext(),Payment::class.java)
            startActivity(intent)
        }


        return view
    }


}
