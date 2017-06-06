package be.sanderdebleecker.hellokotlin.mvp.view.views

import be.sanderdebleecker.hellokotlin.mvp.model.GameModel

/**
 * @author Simulan
 * @version 1.0.0
 * @since 27/05/2017
 */
interface SolitaireView : BaseView {
    fun showToast(msg : String)
    fun update(model: GameModel=GameModel)
}