package com.github.gunin_igor75.dagger_project.example2.data.datasource.imp

import com.github.gunin_igor75.dagger_project.example2.data.datasource.ExampleRemoteDataSource
import com.github.gunin_igor75.dagger_project.example2.data.network.ExampleService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(

    private val apiService: ExampleService

): ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}