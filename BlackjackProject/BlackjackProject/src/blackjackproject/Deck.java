/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackproject;

import java.util.ArrayList;

/**
 *
 * @author Patric Legaspi
 */
public class Deck {
    private ArrayList cardList = new ArrayList();
    
    public ArrayList getCardList() {
        return cardList;
    }
    public void addCards(Card c, ArrayList cL) {
        cardList = cL;
        cardList.add(c);
        cL = cardList;
    }
}
