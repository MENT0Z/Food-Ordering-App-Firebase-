package com.mruraza.food_ordering.adaptors

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.mruraza.food_ordering.FoodDetails
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.modals.PopularRecyclerView

class popularAdaptor(private val mList: List<PopularRecyclerView>,private val requireContext: Context) : RecyclerView.Adapter<popularAdaptor.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): popularAdaptor.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.popular_items_homefrag, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: popularAdaptor.ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        holder.imageView.setImageResource(ItemsViewModel.image)
        val pricee = "$"+ItemsViewModel.price
        holder.price.text = pricee
        holder.food_name.text=ItemsViewModel.itemName

        holder.itemView.setOnClickListener {
            val intent = Intent(requireContext, FoodDetails::class.java)
            intent.putExtra("ItemName",ItemsViewModel.itemName)
            intent.putExtra("ItemImage",ItemsViewModel.image)
            requireContext.startActivity(intent)
        }

        holder.btnToAddToCart.setOnClickListener {
            Toast.makeText(requireContext,"Paxi Garxu Yaar Yo Kaam with backend ",Toast.LENGTH_SHORT).show()
        }



    }

    override fun getItemCount(): Int {
        return mList.size
    }
    class ViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.photo_in_popular_IV)
        val price : TextView = itemView.findViewById(R.id.priceTVPopular)
        val food_name : TextView = itemView.findViewById(R.id.food_name_TV_popular)
        val btnToAddToCart : TextView = itemView.findViewById(R.id.add_to_cart_TV_popular)

    }
}