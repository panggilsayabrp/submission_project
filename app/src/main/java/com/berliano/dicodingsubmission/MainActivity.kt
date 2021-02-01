package com.berliano.dicodingsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.berliano.dicodingsubmission.TourismData.listData

class MainActivity : AppCompatActivity() {
    private lateinit var rvTourism: RecyclerView
    private var list: ArrayList<Tourism> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTourism = findViewById(R.id.rv_tourism)
        rvTourism.setHasFixedSize(true)

        list.addAll(listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvTourism.layoutManager = LinearLayoutManager(this)
        val listTourismAdapter = ListTourismAdapter(list)
        rvTourism.adapter = listTourismAdapter

        listTourismAdapter.setOnItemClickCallback(object : ListTourismAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Tourism) {
                showSelectedTourism(data)
            }
        })
    }

    private fun showSelectedTourism(tourism: Tourism) {
        Toast.makeText(this, "Kamu Memilih " + tourism.name, Toast.LENGTH_SHORT).show()
    }
}