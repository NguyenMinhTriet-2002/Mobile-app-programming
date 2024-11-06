package com.lab.juicetracker.data

/**
 * App container for Dependency injection.
 */
interface AppContainer {
    val trackerRepository: JuiceRepository
}