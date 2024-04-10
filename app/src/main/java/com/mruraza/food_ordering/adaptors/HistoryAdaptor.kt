package com.mruraza.food_ordering.adaptors

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.mruraza.food_ordering.FoodDetails
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.modals.HistoryItems

class HistoryAdaptor(private val mylist :ArrayList<HistoryItems>,private val requireContext: Context):RecyclerView.Adapter<HistoryAdaptor.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryAdaptor.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.history_items , parent , false)
        return HistoryAdaptor.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HistoryAdaptor.ViewHolder, position: Int) {
        val curlist = mylist[position]
        holder.itemName.text = curlist.itemName
        holder.itemimage.setImageResource(curlist.imageName)
        holder.itemPrice.text = curlist.itemPrice

        holder.itemView.setOnClickListener {
            val intent = Intent(requireContext, FoodDetails::class.java)
            intent.putExtra("ItemName",curlist.itemName)
            intent.putExtra("ItemImage",curlist.imageName)
            requireContext.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return mylist.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val itemimage:ImageView = itemView.findViewById(R.id.ImagePreviouslyBuyHistory)
        val itemName : TextView = itemView.findViewById(R.id.NameOfFoodHistoryPrev)
        val itemPrice :TextView = itemView.findViewById(R.id.priceTVHistoryPrev)

    }
}