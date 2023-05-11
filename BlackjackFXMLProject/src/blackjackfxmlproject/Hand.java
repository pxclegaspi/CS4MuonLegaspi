/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackfxmlproject;

import java.util.ArrayList;

/**
 *
 * @author MUON
 */
public class Hand {
    private String name;
    private ArrayList cardsHeld = new ArrayList();
    private int cardsValue;
    private double bet;
    
    public String getName() {
        return name;
    }
    public ArrayList getCardsHeld() {
        return cardsHeld;
    }
    public int getCardsValue() {
        for(int i = 0; i < cardsHeld.size(); i++) {
            cardsValue += (int) cardsHeld.get(i);
        }
        return cardsValue;
    }
    public double getBet() {
        return bet;
    }
    
    public Hand(String n) {
        name = n;
    }
}

