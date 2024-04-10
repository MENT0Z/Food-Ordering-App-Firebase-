package com.mruraza.food_ordering.adaptors

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.mruraza.food_ordering.FoodDetails
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.modals.CartItems

class cartAdaptor(val mylist : ArrayList<CartItems>,private val requireContext: Context):RecyclerView.Adapter<cartAdaptor.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cartAdaptor.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cart_list, parent, false)

        return cartAdaptor.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: cartAdaptor.ViewHolder, position: Int) {
        val curlist = mylist[position]
        holder.itemName.text = curlist.itemName
        holder.itemImage.setImageResource(curlist.itemImage)
        val price = curlist.itemPrice.trim().toInt()
        var tot_price= ((curlist.quantity)*(price)).toString()
        holder.itemPrice.text = tot_price
        holder.Quantity.text = curlist.quantity.toString()

        holder.plusBtn.setOnClickListener{
            if(curlist.quantity<10) {
                curlist.quantity++
                holder.Quantity.text = curlist.quantity.toString()
                val price = curlist.itemPrice.trim().toInt()
                var tot_price= ((curlist.quantity)*(price)).toString()
                holder.itemPrice.text = tot_price
            }
        }
        holder.minusBtn.setOnClickListener{
            if(curlist.quantity>1) {
                curlist.quantity--
                holder.Quantity.text = curlist.quantity.toString()
                val price = curlist.itemPrice.trim().toInt()
                var tot_price= ((curlist.quantity)*(price)).toString()
                holder.itemPrice.text = tot_price
            }

        }
        holder.deltebtn.setOnClickListener{

                mylist.removeAt(position)
                notifyItemRemoved(position)
                notifyItemRangeChanged(position, mylist.size)

        }



        holder.itemView.setOnClickListener {
            val intent = Intent(requireContext, FoodDetails::class.java)
            intent.putExtra("ItemName",curlist.itemName)
            intent.putExtra("ItemImage",curlist.itemImage)
            requireContext.startActivity(intent)
        }

    }
    override fun getItemCount(): Int {
        return mylist.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val itemImage : ImageView = itemView.findViewById(R.id.itemImageCart)
        val itemName : TextView = itemView.findViewById(R.id.itemNameCartTV)
        val itemPrice : TextView = itemView.findViewById(R.id.priceTVCart)
        val Quantity : TextView = itemView.findViewById(R.id.quantityCart)
        val plusBtn : TextView = itemView.findViewById(R.id.plusTVCart)
        val minusBtn : TextView = itemView.findViewById(R.id.minusTVCart)
        val deltebtn: ImageView = itemView.findViewById(R.id.delete_item_cartIV)
    }
}