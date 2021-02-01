package com.berliano.dicodingsubmission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListTourismAdapter(private val listTourism: ArrayList<Tourism>) : RecyclerView.Adapter<ListTourismAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListTourismAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_tourism, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder:ListViewHolder, position: Int) {
        val tourism = listTourism[position]

        Glide.with(holder.itemView.context)
            .load(tourism.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = tourism.name
        holder.tvDetail.text = tourism.detail

        val tContex = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveToDetail = Intent(tContex, TourismDetail::class.java)
            moveToDetail.putExtra(TourismDetail.EXTRA_NAME, tourism.name)
            moveToDetail.putExtra(TourismDetail.EXTRA_IMAGE, tourism.photo)
            moveToDetail.putExtra(TourismDetail.EXTRA_DETAIL, tourism.detail)
            tContex.startActivity(moveToDetail)
        }
    }

    override fun getItemCount(): Int {
        return listTourism.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Tourism)
    }
}


