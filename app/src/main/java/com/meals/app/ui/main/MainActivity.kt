package com.meals.app.ui.main

import android.content.Context
import android.content.Intent
import com.meals.app.R
import com.meals.app.base.BaseActivity
import com.meals.app.databinding.ActivityMainBinding
import com.meals.app.ui.dialog.DialogConfirmation
import com.meals.app.ui.main.MealViewModel.UiRequest
import com.meals.app.ui.meal.MealAdapter
import com.meals.app.ui.meal.detail.MealDetailActivity
import com.meals.ext.alert.showLongToast
import com.meals.ext.common.exitFromApps
import com.meals.ext.vm.observe
import com.meals.model.State
import java.util.*

class MainActivity : BaseActivity<MealViewModel, ActivityMainBinding>(MealViewModel::class.java) {

    companion object {
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, MainActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun layoutResources() = R.layout.activity_main

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    private lateinit var adapter: MealAdapter

    override fun onViewCreated() {
        binding.apply {
            lifecycleOwner = this@MainActivity
            vm = viewModel
        }
    }

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    override fun initAPI() {
        viewModel.fetchRandomMeals()
    }

    override fun setupAdapter() {
        adapter = MealAdapter(viewModel)
        binding.recyclerMeal.adapter = adapter
    }

    override fun setupObserver() {
        viewModel.run {
            observe(uiRequest) {
                when (it.first) {
                    UiRequest.DETAIL_MEAL -> goToDetails(it.second.id)
                }
            }

            observe(meals) { result ->
                when (result) {
                    is State.Success -> adapter.replaceAll(result.data)
                    is State.Failure -> showLongToast(result.message)
                }
            }
        }
    }

    private fun goToDetails(id: Long?) {
        MealDetailActivity.start(this@MainActivity, id)
    }

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    override fun onBackPressed() {
        DialogConfirmation(this@MainActivity) { exitFromApps() }
    }

}