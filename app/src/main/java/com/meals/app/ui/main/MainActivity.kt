package com.meals.app.ui.main

import android.content.Context
import android.content.Intent
import com.meals.app.R
import com.meals.app.base.BaseActivity
import com.meals.app.databinding.ActivityMainBinding
import com.meals.app.ui.dialog.DialogConfirmation
import com.meals.app.ui.main.MainViewModel.UiRequest
import com.meals.ext.alert.showLongToast
import com.meals.ext.common.exitFromApps
import com.meals.ext.vm.observe
import com.meals.model.Meal
import com.meals.model.State
import com.meals.repository.BuildConfig
import java.util.*

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>(MainViewModel::class.java) {

    companion object {
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, MainActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun layoutResources() = R.layout.activity_main

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    override fun onViewCreated() {
        binding.apply {
            lifecycleOwner = this@MainActivity
            vm = viewModel
        }
    }

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    override fun initAPI() {
        viewModel.fetchRandomMeals(BuildConfig.API_KEY)
    }

    override fun setupObserver() {
        viewModel.run {
            observe(uiRequest) {
                when (it) {
                    UiRequest.GET_RANDOM -> fetchRandomMeals(BuildConfig.API_KEY)
                    else -> return@observe
                }
            }

            observe(meals) { result ->
                when (result) {
                    is State.Success -> assignMeal(result.data.firstOrNull())
                    is State.Failure -> showLongToast(result.message)
                }
            }
        }
    }

    private fun assignMeal(data: Meal?) {
        binding.item = data
    }

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    override fun onBackPressed() {
        DialogConfirmation(this@MainActivity) { exitFromApps() }
    }

}