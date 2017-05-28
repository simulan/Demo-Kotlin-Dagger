package be.sanderdebleecker.hellokotlin.core.di.components

import android.content.Context
import be.sanderdebleecker.hellokotlin.core.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author Simulan
 * @version 1.0.0
 * @since 28/05/2017
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun exposeContext(): Context
}
