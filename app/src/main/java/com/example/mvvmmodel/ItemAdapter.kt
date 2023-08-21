package com.example.mvvmmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(var list:List<Result>):RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
  class ViewHolder(view: View):RecyclerView.ViewHolder(view){
      var image:ImageView=view.findViewById(R.id.characterImage)
      var name:TextView=view.findViewById(R.id.showName)
  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return ViewHolder(layoutView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listData =list[position]
        holder.image.setImage(listData.image)
        holder.name.text=listData.name
    }
    }
