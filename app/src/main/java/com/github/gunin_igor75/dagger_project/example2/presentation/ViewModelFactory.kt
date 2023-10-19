package com.github.gunin_igor75.dagger_project.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.gunin_igor75.dagger_project.example2.di.AppScope
import javax.inject.Inject
import javax.inject.Provider


class ViewModelFactory @Inject constructor(
//
//    private val useCase: ExampleUseCase

    private val viewModelsProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>

): ViewModelProvider.Factory {

    //    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass == ExampleViewModel::class.java) {
//            return (ExampleViewModel(useCase)) as T
//        }
//        throw RuntimeException("Unknown view model $modelClass")
//    }
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelsProviders[modelClass]?.get() as T
    }
}