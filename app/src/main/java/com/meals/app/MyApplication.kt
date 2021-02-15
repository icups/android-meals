package com.meals.app

import android.content.ContextWrapper
import androidx.multidex.MultiDexApplication
import com.meals.app.koin.module.networkModule
import com.meals.app.koin.module.repositoryModule
import com.meals.app.koin.module.viewModelModule
import com.meals.app.koin.source.localDataSourceModule
import com.meals.app.koin.source.remoteDataSource
import com.pixplicity.easyprefs.library.Prefs
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class MyApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        initializeDependencyInjection()
        initializePreferences()
    }

    private fun initializeDependencyInjection() {
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(appModules())
        }
    }

    private fun initializePreferences() {
        Prefs.Builder()
            .setContext(this)
            .setMode(ContextWrapper.MODE_PRIVATE)
            .setPrefsName(packageName)
            .setUseDefaultSharedPreference(true)
            .build()
    }

    private fun appModules(): List<Module> {
        return listOf(
            networkModule,
            localDataSourceModule,
            remoteDataSource,
            repositoryModule,
            viewModelModule
        )
    }

}