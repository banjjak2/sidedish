package com.example.sideDish.network.dto

import com.example.sideDish.data.model.FoodDetail
import com.google.gson.annotations.SerializedName

data class DetailData(
    @SerializedName("delivery_fee")
    val deliveryFee: String,
    @SerializedName("delivery_info")
    val deliveryInfo: String,
    @SerializedName("detail_section")
    val detailSection: List<String>,
    val point: String,
    val prices: List<String>,
    @SerializedName("product_description")
    val productDescription: String,
    @SerializedName("thumb_images")
    val thumbImages: List<String>,
    @SerializedName("top_image")
    val topImage: String
)

data class DetailDto(
    val hash: String,
    @SerializedName("data")
    val detail: DetailData
)

fun DetailDto?.toFoodDetail(): FoodDetail {
    return if (this == null || hash.isEmpty()) {
        emptyFoodDetail()
    } else {
        FoodDetail(
            detail.deliveryFee,
            detail.deliveryInfo,
            detail.detailSection,
            detail.point,
            originalPrice = if (detail.prices.size > 1) detail.prices[0] else "",
            discountedPrice = if (detail.prices.size > 1) detail.prices[1] else detail.prices[0],
            detail.productDescription,
            detail.thumbImages,
            detail.topImage,
        )
    }
}

private fun emptyFoodDetail(): FoodDetail {
    return FoodDetail(
        "",
        "",
        listOf(),
        "",
        "",
        "",
        "",
        listOf(),
        ""
    )
}