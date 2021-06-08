package com.dicoding.movieapi

import android.app.Application
import com.dicoding.movieapi.core.di.databaseModule
import com.dicoding.movieapi.core.di.networkModule
import com.dicoding.movieapi.core.di.repositoryModule
import com.dicoding.movieapi.di.useCaseModule
import com.dicoding.movieapi.di.viewModuleModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModuleModule
                )
            )
        }
    }
}