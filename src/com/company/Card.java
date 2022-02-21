package com.company;


//  A card should have at least 3 properties: suit, rank, and value

public class Card {


    private String suitOfCard;
    private String rankOfCard;
    private String valueOfCard;
    public Card(String suit, String rank, String value){
        suitOfCard = suit;
        rankOfCard = rank;
        valueOfCard = value;
    }
    public String toString(){
        return suitOfCard + " " + rankOfCard + " " + valueOfCard;
    }


    public void setSuitOfCard(String suit){
        suitOfCard = suit;

    }

    public String getSuitOfCard(){
        return suitOfCard;
    }


    public void setRankOfCard(String rank){
        rankOfCard = rank;
    }

    public String getRankOfCard(){
        return rankOfCard;
    }


    public void setValueOfCard(String value){
        valueOfCard = value;

    }

    public String getValueOfCard(){
        return valueOfCard;
    }



}
