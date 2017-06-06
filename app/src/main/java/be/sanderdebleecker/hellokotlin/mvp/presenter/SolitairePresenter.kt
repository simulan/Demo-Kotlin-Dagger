package be.sanderdebleecker.hellokotlin.mvp.presenter

import be.sanderdebleecker.hellokotlin.mvp.model.GameModel
import be.sanderdebleecker.hellokotlin.mvp.view.views.SolitaireView
import javax.inject.Inject

/**
 * @author Simulan
 * @version 1.0.0
 * @since 27/05/2017
 */
class SolitairePresenter @Inject constructor() : BasePresenter<SolitaireView>() {

    fun start() {
        GameModel.resetGame()
        GameModel.debugPrint()
    }

    fun onDeckTap() {
        GameModel.onDeckTap()
        getView().update()
    }
    fun onWasteTap() {
        GameModel.onWasteTap()
        getView().update()
    }
    fun onFoundationTap(foundationIndex: Int) {
        GameModel.onFoundationTap(foundationIndex)
        getView().update()
    }
    fun onTableauTap(tableauIndex: Int, cardIndex: Int) {
        GameModel.onTableauTap(tableauIndex,cardIndex)
        getView().update()
    }

}