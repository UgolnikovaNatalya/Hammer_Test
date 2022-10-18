package com.example.test.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.api.Drink
import com.squareup.picasso.Picasso

class CocktailsAdapter : RecyclerView.Adapter<CocktailsAdapter.ViewHolder>() {

    private var mainList = listOf<Drink>()

    fun showList (list: List<Drink>){
        this.mainList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_recycler_cell, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setInfo(mainList[position])
    }

    override fun getItemCount(): Int = mainList.size

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun setInfo(data: Drink) {
            itemView.findViewById<TextView>(R.id.drink_name).text = data.strDrink
            itemView.findViewById<TextView>(R.id.drink_instruction).text = data.strInstructions
            itemView.findViewById<TextView>(R.id.drink_state).text = data.idDrink

            val image = itemView.findViewById<ImageView>(R.id.image)
            Picasso.get().load(data.strDrinkThumb).into(image)
        }
    }
}