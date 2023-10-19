package com.github.gunin_igor75.dagger_project.example2.data.repository

import com.github.gunin_igor75.dagger_project.example2.data.datasource.ExampleLocalDataSource
import com.github.gunin_igor75.dagger_project.example2.data.datasource.ExampleRemoteDataSource
import com.github.gunin_igor75.dagger_project.example2.data.mapper.ExampleMapper
import com.github.gunin_igor75.dagger_project.example2.di.TestQualifier
import com.github.gunin_igor75.dagger_project.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @TestQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
): ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}