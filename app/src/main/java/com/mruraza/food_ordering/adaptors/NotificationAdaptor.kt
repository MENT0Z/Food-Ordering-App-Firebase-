package com.mruraza.food_ordering.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mruraza.food_ordering.R
import com.mruraza.food_ordering.modals.Notification

class NotificationAdaptor(val mylist:ArrayList<Notification>):RecyclerView.Adapter<NotificationAdaptor.ViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NotificationAdaptor.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.notification,parent,false)
        return NotificationAdaptor.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotificationAdaptor.ViewHolder, position: Int) {
        val curlist = mylist[position]
        holder.image.setImageResource(curlist.emojiPic)
        holder.textt.text=curlist.message
    }

    override fun getItemCount(): Int {
        return mylist.size
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val image:ImageView = itemView.findViewById(R.id.imageNotification)
        val textt : TextView = itemView.findViewById(R.id.notificationText)
    }
}