package com.meals.app.ui.meal.detail

import android.content.Context
import android.content.Intent
import com.meals.app.R
import com.meals.app.base.BaseActivity
import com.meals.app.databinding.ActivityMealDetailBinding
import com.meals.app.ui.main.MealViewModel
import com.meals.ext.alert.showLongToast
import com.meals.ext.vm.observe
import com.meals.model.State

class MealDetailActivity : BaseActivity<MealViewModel, ActivityMealDetailBinding>(MealViewModel::class.java) {

    companion object {
        private const val KEY_ID = "ID_MEAL"

        @JvmStatic
        fun start(context: Context, id: Long?) {
            val starter = Intent(context, MealDetailActivity::class.java).putExtra(KEY_ID, "$id")
            context.startActivity(starter)
        }
    }

    override fun layoutResources() = R.layout.activity_meal_detail

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    override fun onViewCreated() {
        binding.apply {
            lifecycleOwner = this@MealDetailActivity
            vm = viewModel

            toolbar.apply {
                title = "Instruction"
            }.also {
                setSupportActionBar(it)
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
                supportActionBar?.setHomeButtonEnabled(true)
                it.setNavigationOnClickListener { onBackPressed() }
            }
        }
    }

    override fun initAPI() {
        intent?.getStringExtra(KEY_ID)?.run { viewModel.fetchMealDetail(this) }
    }

    override fun setupObserver() {
        viewModel.run {
            observe(meals) { result ->
                when (result) {
                    is State.Success -> binding.item = result.data.firstOrNull()
                    is State.Failure -> showLongToast(result.message)
                }
            }
        }
    }

}