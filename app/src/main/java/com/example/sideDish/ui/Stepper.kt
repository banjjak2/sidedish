package com.example.sideDish.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.sideDish.R
import com.example.sideDish.databinding.StepperBinding
import com.example.sideDish.ui.productdetail.FoodDetailViewModel

class Stepper(context: Context, attrs: AttributeSet) :
    LinearLayout(context, attrs) {

    var viewModel: FoodDetailViewModel? = null

    var binding: StepperBinding =
        DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.stepper, this, true)
    var count: Int = 0

    init {
        binding.buttonStepperPlus.setOnClickListener {
            viewModel?.orderCount?.value = viewModel?.orderCount?.value?.plus(1)
        }
        binding.buttonStepperMinus.setOnClickListener {
            viewModel?.orderCount?.value = viewModel?.orderCount?.value?.minus(1)
        }
    }


}