package be.sanderdebleecker.hellokotlin.mvp.model

import java.util.*

/**
 * @author Simulan
 * @version 1.0.0
 * @since 30/05/2017
 */
class Deck {
    val cards: Array<Card> = Array(52, { Card(it % 13, getSuit(it)) })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard() : Card = cardsInDeck.removeAt(0)

    fun reset() {
        cardsInDeck = cards.toMutableList()
        cardsInDeck.forEach { it.faceUp=false }
        Collections.shuffle(cardsInDeck)
    }

    private fun getSuit(i: Int): String = when (i / 13) {
        0 -> clubs
        1 -> diamonds
        2 -> hearts
        else -> spades
    }
}