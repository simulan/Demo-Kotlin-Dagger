package be.sanderdebleecker.hellokotlin.mvp.presenter

import be.sanderdebleecker.hellokotlin.mvp.view.views.SolitaireView
import javax.inject.Inject

/**
 * @author Simulan
 * @version 1.0.0
 * @since 27/05/2017
 */
class SolitairePresenter @Inject constructor() : BasePresenter<SolitaireView>() {


    fun hello() {
        getView().showToast("Hello kotlin world!")
    }

}