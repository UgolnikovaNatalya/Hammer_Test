package com.example.test.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.api.Drink

class SortMenuAdapter : RecyclerView.Adapter<SortMenuAdapter.ViewHolder>() {

    var sortList = listOf<Drink>()

    fun showSort (list: List<Drink>){
        this.sortList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sort_sell, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setInfo(sortList[position])
    }

    override fun getItemCount(): Int = sortList.size

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun setInfo(data: Drink) {
            itemView.findViewById<TextView>(R.id.sort_name).text = data.strAlcoholic
        }
    }
}