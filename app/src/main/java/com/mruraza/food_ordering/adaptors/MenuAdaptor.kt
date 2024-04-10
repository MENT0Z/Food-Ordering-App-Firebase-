package com.mruraza.food_ordering.adaptors

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.mruraza.food_ordering.FoodDetails
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.modals.Menu

class MenuAdaptor(private val mylist : ArrayList<Menu>,val requireContext: Context) : RecyclerView.Adapter<MenuAdaptor.Viewholder>() {


    private val itemClickListener : OnClickListener ?= null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdaptor.Viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.menu_items, parent, false)
        return MenuAdaptor.Viewholder(view)
    }

    override fun onBindViewHolder(holder: MenuAdaptor.Viewholder, position: Int) {
        val curlist = mylist[position]
        holder.itemName.text = curlist.itemName
        holder.itemImage.setImageResource(curlist.itemPhoto)
        holder.itemPrice.text = curlist.itemPrice

        holder.itemView.setOnClickListener {
//            if(position!=RecyclerView.NO_POSITION){
//                itemClickListener?.onItemClick(position)
//            }

            val intent = Intent(requireContext,FoodDetails::class.java)
            intent.putExtra("ItemName",curlist.itemName)
            intent.putExtra("ItemImage",curlist.itemPhoto)
            requireContext.startActivity(intent)

        }
        holder.btnToAddToCart.setOnClickListener {
            Toast.makeText(requireContext,"Paxi Garxu Yaar Yo Kaam with adaptor",Toast.LENGTH_SHORT).show()
        }



    }

    override fun getItemCount(): Int {
        return mylist.size
    }
    class Viewholder(itemView : View):RecyclerView.ViewHolder(itemView) {


        val itemImage:ImageView = itemView.findViewById(R.id.photo_in_menu_IV)
        val itemName : TextView = itemView.findViewById(R.id.food_name_TV_menu)
        val itemPrice : TextView = itemView.findViewById(R.id.priceTVMenu)
        val btnToAddToCart : TextView = itemView.findViewById(R.id.add_to_cart_TV_menu)
    }
//    interface OnClickListener{
//        fun onItemClick(position: Int)
//    }
}

