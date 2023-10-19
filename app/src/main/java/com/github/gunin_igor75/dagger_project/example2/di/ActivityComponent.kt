package com.github.gunin_igor75.dagger_project.example2.di

import com.github.gunin_igor75.dagger_project.example2.presentation.MainActivity
import com.github.gunin_igor75.dagger_project.example2.presentation.MainActivityNew
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivityNew)

    @Subcomponent.Factory
    interface Factory{
        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ): ActivityComponent
    }
}