package com.berliano.dicodingsubmission


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TourismDetail : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "name_data"
        const val EXTRA_IMAGE = "image_data"
        const val EXTRA_DETAIL = "details_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourism_detail)
        val tvDetailName : TextView = findViewById(R.id.tv_item_name)
        val tvDetailImage : ImageView = findViewById(R.id.img_item_photo)
        val tvDetailDetails : TextView = findViewById(R.id.tv_item_detail)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImage = intent.getStringExtra(EXTRA_IMAGE)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)

        tvDetailName.text = tName
        Glide.with(this)
            .load(tImage)
            .apply(RequestOptions())
            .into(tvDetailImage)
        tvDetailDetails.text = tDetail
    }
}