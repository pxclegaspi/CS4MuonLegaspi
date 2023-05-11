/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackfxmlproject;

import java.util.ArrayList;

/**
 *
 * @author Patric Legaspi
 */
public class Card {
    private String rank, suit, imgFileNamePermanent, imgFileNameTemporary;
    private int rankValue;
    private static ArrayList Deck = new ArrayList();
    
    public String getRank() {
        return rank;
    }
    public int getRankValue() {
        return rankValue;
    }    
    public String getSuit() {
        return suit;
    }
    public String getImgFileNamePermanent() {
        return imgFileNamePermanent;
    }
    public String getImgFileNameTemporary() {
        return imgFileNameTemporary;
    }
    public static ArrayList getDeck() {
        return Deck;
    }
    
    public Card(String r, String s, String iFN, int rV) {
        rank = r;
        suit = s;
        imgFileNamePermanent = iFN;
        imgFileNamePermanent = iFN;
        rankValue = rV;
        Deck.add(this);
    }
    
    public void showCard() {
        imgFileNameTemporary = imgFileNamePermanent;
    }
    public void hideCard() {
        imgFileNameTemporary = "media/back.png";
    }
}
