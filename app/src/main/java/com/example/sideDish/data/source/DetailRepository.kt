package com.example.sideDish.data.source

import com.example.sideDish.data.model.FoodDetail
import com.example.sideDish.network.dto.DetailDto
import retrofit2.Response

interface DetailRepository {

    suspend fun getDetail(detailHash: String): FoodDetail?
}
