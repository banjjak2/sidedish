package com.example.sideDish.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import com.example.sideDish.R
import com.example.sideDish.ui.productdetail.FoodDetailViewModel

class Stepper(context: Context, attrs: AttributeSet) :
    LinearLayout(context, attrs) {
    lateinit var plus: ImageButton
    lateinit var value: TextView
    lateinit var minus: ImageButton
    var viewModel: FoodDetailViewModel? = null
    var count: Int = 0

    init {
        LayoutInflater.from(context).inflate(R.layout.stepper, this, true)
        plus = findViewById(R.id.button_stepper_plus)
        value = findViewById(R.id.text_view_stepper_value)
        minus = findViewById(R.id.button_stepper_minus)

        value.text = count.toString()

        plus.setOnClickListener {
            viewModel?.orderCount?.value = viewModel?.orderCount?.value?.plus(1)
        }
        minus.setOnClickListener {
            viewModel?.orderCount?.value = viewModel?.orderCount?.value?.minus(1)
        }
    }


}