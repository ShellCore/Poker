package com.shellcore.java.poker;

/**
 * Created by Cesar. 04/05/2017.
 */
public class PokerCard implements Comparable<PokerCard> {

    // Tipos de carta
    public static final int SPADES   = 4;
    public static final int HEARTS   = 3;
    public static final int CLUBS    = 2;
    public static final int DIAMONDS = 1;

    // Numeración de las cartas
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    private int suit; // 1 a 4
    private int number; // 2 a 14

    public PokerCard(int suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public int compareTo(PokerCard o) {
        if (this.number < o.number) {
            return -1;
        } else if (this.number > o.number) {
            return 1;
        } else {
            if (this.suit < o.suit) {
                return -1;
            } else if (this.suit > o.suit) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
