package com.example.sideDish.ui.productdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sideDish.data.source.FoodDetail
import com.example.sideDish.data.source.FoodRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FoodDetailViewModel @Inject constructor(private val repository: FoodRepository) : ViewModel() {
    private val _detail = MutableLiveData<FoodDetail>()
    val detail: LiveData<FoodDetail> = _detail

    val orderCount = MutableLiveData<Int>(0)

    init {
        getDetail("hash")
    }
    fun getDetail(hash: String) {
        _detail.value = repository.getFoodDetail(hash)
    }
}