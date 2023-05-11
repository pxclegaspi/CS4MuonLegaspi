/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackfxmlproject;

import java.util.ArrayList;
import java.util.Collections;

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
    
    public void dealCards(ArrayList HA) {
        Collections.shuffle(Card.getDeck());
        for(int j=0; j < 2; j++) {
            for(int i=0; i < PlayersPlaying.size(); i++) {
                String s = Integer.toString(i);
                Hand h = new Hand("Player" + s + "Hand1");
                Card c = ((Card) Card.getDeck().get(0));
                c.showCard();
                h.getCardsHeld().add(c);
                ((Player) PlayersPlaying.get(i)).getHandList().add(h);
                Card.getDeck().remove(0);
            }
            Card c = ((Card) Card.getDeck().get(0));
            if(j == 0) {
                c.showCard();
            }
            if(j == 1) {
                c.hideCard();
            }
            DealerCardsHeld.add(c);
            Card.getDeck().remove(0);
        }
    }
}
