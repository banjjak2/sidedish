package com.example.sideDish.data.source

data class Data(
    val delivery_fee: String,
    val delivery_info: String,
    val detail_section: List<String>,
    val point: String,
    val prices: List<String>,
    val product_description: String,
    val thumb_images: List<String>,
    val top_image: String
)