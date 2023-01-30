/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackproject;

import java.util.ArrayList;

/**
 *
 * @author MUON
 */
public class Player {
    private String name;
    private double money;
    private ArrayList cardsHeld = new ArrayList();
    private int cardsValue;
    private int bet;
    
    public String getName() {
        return name;
    }
    public double getMoney() {
        return money;
    }
    public int getCardsValue() {
        for(int i = 0; i < cardsHeld.size(); i++) {
            cardsValue += (int) cardsHeld.get(i);
        }
        return cardsValue;
    }
    public int getBet() {
        return bet;
    }
}

