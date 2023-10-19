package com.github.gunin_igor75.dagger_project.example2.data.database

import android.content.Context
import android.util.Log
import com.github.gunin_igor75.dagger_project.R
import javax.inject.Inject


class ExampleDatabase @Inject constructor(

    private val context: Context,

    private val time: Long

) {
    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} time $time $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}