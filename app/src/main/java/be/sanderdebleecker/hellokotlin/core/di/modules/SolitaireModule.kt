package be.sanderdebleecker.hellokotlin.core.di.modules

import be.sanderdebleecker.hellokotlin.core.di.scopes.PerActivity
import be.sanderdebleecker.hellokotlin.mvp.presenter.SolitairePresenter
import be.sanderdebleecker.hellokotlin.mvp.view.views.SolitaireView
import dagger.Module
import dagger.Provides

/**
 * @author Simulan
 * @version 1.0.0
 * @since 28/05/2017
 */
@Module
class SolitaireModule(private val mView: SolitaireView) {
    @PerActivity
    @Provides
    internal fun provideView(): SolitaireView {
        return mView
    }
}
