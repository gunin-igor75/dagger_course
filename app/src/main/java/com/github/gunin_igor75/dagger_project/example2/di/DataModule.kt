package com.github.gunin_igor75.dagger_project.example2.di

import com.github.gunin_igor75.dagger_project.example2.data.datasource.ExampleLocalDataSource
import com.github.gunin_igor75.dagger_project.example2.data.datasource.ExampleRemoteDataSource
import com.github.gunin_igor75.dagger_project.example2.data.datasource.imp.ExampleLocalDataSourceImpl
import com.github.gunin_igor75.dagger_project.example2.data.datasource.imp.ExampleRemoteDataSourceImpl
import com.github.gunin_igor75.dagger_project.example2.data.datasource.imp.TestExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindsLocalSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @Binds
    fun bindsRemoteSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @Binds
    fun bindsTestRemoteSource(impl: TestExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}