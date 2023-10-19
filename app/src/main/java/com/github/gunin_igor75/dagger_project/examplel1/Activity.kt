package com.github.gunin_igor75.dagger_project.examplel1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer


    init {
        DaggerNewComponent.create().inject(this)
    }
}