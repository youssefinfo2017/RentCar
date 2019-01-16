package com.youssefinfo.rentcar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.GridLayout.VERTICAL


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rview = findViewById<View>(R.id.rview) as RecyclerView
        val car = intArrayOf(R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a1,R.drawable.a6)
        val name = arrayOf("Renault","Peugeot","BMW","Clio","Hyndai","Fiat")
        val lManager =GridLayoutManager(this,2,VERTICAL,false)
        rview.setLayoutManager(lManager)
        rview.adapter = MyAdapter(car,name,this)
    }
}
