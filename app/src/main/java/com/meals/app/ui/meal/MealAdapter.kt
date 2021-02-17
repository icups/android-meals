package com.meals.app.ui.meal

import com.meals.app.R
import com.meals.app.base.BaseSingleAdapter
import com.meals.app.databinding.ItemMealBinding
import com.meals.app.ui.main.MealViewModel
import com.meals.model.Meal

class MealAdapter(private val viewModel: MealViewModel) : BaseSingleAdapter<Meal, ItemMealBinding>() {

    init {
        setHasStableIds(true)
    }

    override fun getItemId(position: Int): Long {
        return try {
            mList[position].id
        } catch (ex: Exception) {
            0L
        }
    }

    override fun onBindBaseViewHolder(binding: ItemMealBinding, data: Meal, adapterPosition: Int) {
        binding.vm = viewModel
        binding.item = data
    }

    override fun layoutResources(): Int {
        return R.layout.item_meal
    }

    override fun animated(): Boolean {
        return true
    }

}