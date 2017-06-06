package be.sanderdebleecker.hellokotlin

import be.sanderdebleecker.hellokotlin.mvp.model.GameModel
import org.junit.Test

/**
 * @author Simulan
 * @version 1.0.0
 * @since 06/06/2017
 */
class GameTest {
    @Test
    fun kingInFirstFoundationPile() {
        // arrange
        var numGames = 0
        var maxGames = 1000
        // act
        for (i in 1..maxGames) {
            numGames++
            GameModel.resetGame()
            for(j in 1..100) {
                GameModel.onDeckTap()
                GameModel.onWasteTap()
                GameModel.tableauPiles.forEachIndexed { index, tableauPile ->
                    GameModel.onTableauTap(index, tableauPile.cards.lastIndex)
                }
            }
            if(GameModel.foundationPiles[0].cards.size==13) {
                break;
            }
        }
        // assert
        GameModel.debugPrint()
        println("# Games: $numGames")
        assert(numGames<maxGames)
    }
}