package be.sanderdebleecker.hellokotlin.core.di.components

import be.sanderdebleecker.hellokotlin.core.di.modules.SolitaireModule
import be.sanderdebleecker.hellokotlin.core.di.scopes.PerActivity
import be.sanderdebleecker.hellokotlin.mvp.view.activities.SolitaireActivity
import dagger.Component

/**
 * @author Simulan
 * @version 1.0.0
 * @since 28/05/2017
 */
@PerActivity
@Component(modules = arrayOf(SolitaireModule::class), dependencies = arrayOf(ApplicationComponent::class))
interface SolitaireComponent {
    fun inject(activity: SolitaireActivity)
}
