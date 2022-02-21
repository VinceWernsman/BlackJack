package com.company;

import java.util.ArrayList;
import java.util.List;

//Create a new class called Deck
//Deck should have a public method that “builds” an arraylist of Card objects
//Assign each Card a Suit (Spades, Clubs, Diamond, and Heart)
//Assigning each card a Rank (2-10, Jack, Queen, King, Ace)
//Assigning each card a value to 2-11
//This should be done to recreate the 52 unique cards in a deck

public class Deck {
    public void buildCards(){
        List deckOfNewCards = new ArrayList(52);
        Card cardOne = new Card("Spades", "2", "2");
        deckOfNewCards.add(cardOne);

        System.out.println (deckOfNewCards.get(0).toString());





    };




}
