package com.github.gunin_igor75.dagger_project.examplel1

import javax.inject.Inject

class ComputerTower @Inject constructor(
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
)