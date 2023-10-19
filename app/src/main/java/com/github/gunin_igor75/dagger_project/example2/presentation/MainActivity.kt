package com.github.gunin_igor75.dagger_project.example2.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.github.gunin_igor75.dagger_project.R
import com.github.gunin_igor75.dagger_project.example2.ExampleApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory


    private val exampleViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val exampleViewModelNew by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModelNew::class.java]
    }

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("MY_ID", "NAME")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exampleViewModel.method()
        exampleViewModelNew.method()

        findViewById<TextView>(R.id.tv_hello_world).setOnClickListener {
            Intent(this, MainActivityNew::class.java).apply {
                startActivity(this)
            }
        }
    }
}