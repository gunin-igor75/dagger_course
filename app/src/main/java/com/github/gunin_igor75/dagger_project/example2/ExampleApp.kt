package com.github.gunin_igor75.dagger_project.example2

import android.app.Application
import com.github.gunin_igor75.dagger_project.example2.di.DaggerApplicationComponent

class ExampleApp: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}