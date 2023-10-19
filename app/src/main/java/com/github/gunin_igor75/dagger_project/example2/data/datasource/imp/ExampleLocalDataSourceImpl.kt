package com.github.gunin_igor75.dagger_project.example2.data.datasource.imp

import com.github.gunin_igor75.dagger_project.example2.data.database.ExampleDatabase
import com.github.gunin_igor75.dagger_project.example2.data.datasource.ExampleLocalDataSource
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(

    private val database: ExampleDatabase

): ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}