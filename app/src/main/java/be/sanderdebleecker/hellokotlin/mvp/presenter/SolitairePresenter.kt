package be.sanderdebleecker.hellokotlin.mvp.presenter

import be.sanderdebleecker.hellokotlin.mvp.view.views.SolitaireView

/**
 * @author Simulan
 * @version 1.0.0
 * @since 27/05/2017
 */
class SolitairePresenter : BasePresenter<SolitaireView>() {
    fun hello() {
        getView().showToast("Hello kotlin world!")
    }

}