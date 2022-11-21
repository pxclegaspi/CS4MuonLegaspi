/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07muonlegaspi;

/**
 *
 * @author MUON
 */
public class Ex07MuonLegaspi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trainer Ash = new Trainer("Ash");
        GrassType Shroomish = new GrassType("Shroomish", "grass", "water", "fire", 100, 50);
        NPC Juan = new NPC("Juan");
        Location Cavite = new Location("Cavite", "patriotism");
        
        Ash.inspect(Shroomish);
        Ash.inspect(Juan);
        Ash.inspect(Cavite);
    }
    
}
