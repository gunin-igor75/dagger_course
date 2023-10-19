package com.github.gunin_igor75.dagger_project.example2.di

import com.github.gunin_igor75.dagger_project.example2.data.repository.ExampleRepositoryImpl
import com.github.gunin_igor75.dagger_project.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @AppScope
    @Binds
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository
}