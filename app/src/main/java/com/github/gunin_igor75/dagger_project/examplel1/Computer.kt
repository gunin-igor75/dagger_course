package com.github.gunin_igor75.dagger_project.examplel1

import javax.inject.Inject

class Computer @Inject constructor(
    val monitor: Monitor,
    val keyboard: Keyboard,
    val mouse: Mouse,
    val computerTower: ComputerTower
)