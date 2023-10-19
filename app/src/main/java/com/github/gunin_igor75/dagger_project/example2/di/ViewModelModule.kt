package com.github.gunin_igor75.dagger_project.example2.di

import androidx.lifecycle.ViewModel
import com.github.gunin_igor75.dagger_project.example2.presentation.ExampleViewModel
import com.github.gunin_igor75.dagger_project.example2.presentation.ExampleViewModelNew
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey


@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(value = ExampleViewModel::class)
    @Binds
    fun bindsExampleViewModel(impl: ExampleViewModel): ViewModel

    @IntoMap
    @ViewModelKey(value = ExampleViewModelNew::class)
    @Binds
    fun bindsExampleViewModelNew(impl: ExampleViewModelNew): ViewModel
}