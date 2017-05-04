package com.shellcore.java.poker;

/**
 * Created by Cesar. 04/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        PokerCard queenOfSpades = new PokerCard(PokerCard.SPADES, PokerCard.QUEEN);
        PokerCard tenOfHearts = new PokerCard(PokerCard.HEARTS, 10);
        PokerCard tenOfCubs = new PokerCard(PokerCard.CLUBS, 10);

        System.out.println(tenOfHearts.compareTo(queenOfSpades));
        System.out.println(tenOfHearts.compareTo(tenOfCubs));
        System.out.println(queenOfSpades.compareTo(queenOfSpades));
    }
}
