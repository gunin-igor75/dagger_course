package com.github.gunin_igor75.dagger_project.example2.di

import android.content.Context
import com.github.gunin_igor75.dagger_project.example2.presentation.MainActivity
import com.github.gunin_igor75.dagger_project.example2.presentation.MainActivityNew
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

//    @Component.Builder
//    interface ApplicationComponentBuilder {
//
//        @BindsInstance
//        fun context(context: Context): ApplicationComponentBuilder
//
//        @BindsInstance
//        fun time(time: Long): ApplicationComponentBuilder
//
//        fun build(): ApplicationComponent
//    }

    @Component.Factory
    interface ApplicationComponentFactory{

        fun create(
            @BindsInstance context: Context,
            @BindsInstance time: Long
        ): ApplicationComponent
    }
}