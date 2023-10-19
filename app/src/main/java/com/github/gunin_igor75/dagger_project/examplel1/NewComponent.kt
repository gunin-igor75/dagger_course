package com.github.gunin_igor75.dagger_project.examplel1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)

}