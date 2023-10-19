package com.github.gunin_igor75.dagger_project.example2.data.datasource.imp

import android.util.Log
import com.github.gunin_igor75.dagger_project.example2.data.datasource.ExampleRemoteDataSource
import javax.inject.Inject

private const val TAG = "ExampleRemoteDataSourceTestImpl"

class TestExampleRemoteDataSourceImpl @Inject constructor()  : ExampleRemoteDataSource {

    override fun method() {
        Log.d(TAG, "test mode")
    }
}