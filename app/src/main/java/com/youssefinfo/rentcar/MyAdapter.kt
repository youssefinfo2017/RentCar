package com.youssefinfo.rentcar

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

    class MyAdapter (private val car :IntArray, private val name:Array<String>, private val mContext: Context):RecyclerView.Adapter<MyHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.main_page,p0,false)
        return MyHolder(v,mContext)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.index(car[position], name[position])
    }

    override fun getItemCount(): Int {
        return car.size
    }
}