package com.github.gunin_igor75.dagger_project.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.gunin_igor75.dagger_project.example2.di.IdQualifier
import com.github.gunin_igor75.dagger_project.example2.di.NameQualifier
import com.github.gunin_igor75.dagger_project.example2.domain.ExampleUseCase
import javax.inject.Inject

private const val TAG = "ExampleViewModelNew"

class ExampleViewModelNew @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val  id: String,
    @NameQualifier private val name: String
): ViewModel() {

    fun method() {
        useCase()
        Log.d(TAG, " $this")
    }
}