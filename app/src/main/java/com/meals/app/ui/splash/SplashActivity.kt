package com.meals.app.ui.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.meals.app.R
import com.meals.app.ui.main.MainActivity
import com.meals.ext.common.launchDelayedFunction

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        initializeSplash()
    }

    private fun initializeSplash() {
        launchDelayedFunction {
            MainActivity.start(this@SplashActivity)
            finish()
        }
    }

}