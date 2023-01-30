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
public class Blackjack {
    private ArrayList PlayersPlaying = new ArrayList();
    private ArrayList DealerCardsHeld = new ArrayList();
    private int dealerCardsHeldValue;
    
    public ArrayList getPlayersPlaying() {
        return PlayersPlaying;
    }
    public ArrayList getDealerCardsHeld() {
        return DealerCardsHeld;
    }
    public int getDealerCardsHeldValue() {
        return dealerCardsHeldValue;
    }
    
    public void addPlayer(Player p, ArrayList PP) {
        PlayersPlaying = PP;
        PlayersPlaying.add(p);
        PP = PlayersPlaying;
    }
    
    public void dealCards(ArrayList PP, ArrayList DCH, Deck d) {
        
    }
}
