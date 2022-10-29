package com.example.test.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.api.Drink
import com.squareup.picasso.Picasso

class CollapsedImageAdapter: RecyclerView.Adapter<CollapsedImageAdapter.ViewHolder>() {

    var imageList = listOf<Drink>()

    fun showImages (list: List<Drink>){
        this.imageList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_cell, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setInfo(imageList[position])
    }

    override fun getItemCount(): Int = imageList.size

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun setInfo(data: Drink) {

            val image = itemView.findViewById<ImageView>(R.id.collapsed_images)
            Picasso.get().load(data.strDrinkThumb).into(image)
        }
    }
}