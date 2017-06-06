package be.sanderdebleecker.hellokotlin.mvp.model

/**
 * @author Simulan
 * @version 1.0.0
 * @since 30/05/2017
 */
class TableauPile(var cards: MutableList<Card> = mutableListOf()) {
    init{
        if(cards.isNotEmpty())
            cards.last().faceUp = true
    }
    fun addCards(newCards: MutableList<Card>) : Boolean {
        if(cards.isNotEmpty()) {
            if(newCards.first().value == cards.last().value - 1 && hasDifferentColor(newCards.first(),cards.last())) {
                cards.addAll(newCards)
                return true
            }
        }else if (newCards.first().value == king) {
            cards.addAll(newCards)
            return true
        }
        return false
    }

    /**
     * @param tappedIndex : from which card position we take off a pile of cards
     */
    fun removeCards(tappedIndex: Int) {
        for (i in cards.lastIndex downTo tappedIndex) {
            cards.removeAt(i)
        }
        if (cards.size >0) {
            cards.last().faceUp = true
        }
    }

    private fun hasDifferentColor(c1: Card, c2: Card): Boolean =
        ((redSuits.contains(c1.suit) && blackSuits.contains(c2.suit)) || (blackSuits.contains(c1.suit) && redSuits.contains(c2.suit)))

}