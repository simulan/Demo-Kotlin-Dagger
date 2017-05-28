package be.sanderdebleecker.hellokotlin.core.application

import android.app.Application
import be.sanderdebleecker.hellokotlin.core.di.components.ApplicationComponent
import be.sanderdebleecker.hellokotlin.core.di.components.DaggerApplicationComponent
import be.sanderdebleecker.hellokotlin.core.di.modules.ApplicationModule

/**
 * @author Simulan
 * @version 1.0.0
 * @since 28/05/2017
 */
class SolitaireApplication : Application() {
    private lateinit var mApplicationComponent: ApplicationComponent;

    override fun onCreate() {
        super.onCreate()
        initializeApplicationComponent()
    }

    private fun initializeApplicationComponent() {
        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    fun getApplicationComponent(): ApplicationComponent {
        return mApplicationComponent
    }
}