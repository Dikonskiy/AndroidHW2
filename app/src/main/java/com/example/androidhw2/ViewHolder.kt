package com.example.androidhw2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView
    val charName: TextView
    val charDescription: TextView

    init {
        imageView = itemView.findViewById(R.id.imageView)
        charName = itemView.findViewById(R.id.foodName)
        charDescription = itemView.findViewById(R.id.foodDescription)
    }
}