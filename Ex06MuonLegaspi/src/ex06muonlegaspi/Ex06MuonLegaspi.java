/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06muonlegaspi;

/**
 *
 * @author MUON
 */
public class Ex06MuonLegaspi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FireType charmander = new FireType("Charmander", "fire", "grass", "water", 100, 50);
        WaterType squirtle = new WaterType("Squirtle", "water", "fire", "grass", 100, 50);
        GrassType bulbasaur = new GrassType("Bulbasaur", "grass", "water", "fire", 100, 50);
        
        while(bulbasaur.hp > 0 && charmander.hp > 0) {
            bulbasaur.attack(charmander);
            if(charmander.hp <= 0) {
                break;
            }
            charmander.attack(bulbasaur);
        }
        bulbasaur.resetHealth();
        charmander.resetHealth();
        
        System.out.printf("%n%n");
        
        while(charmander.hp > 0 && squirtle.hp > 0) {
            charmander.attack(squirtle);
            if(squirtle.hp <= 0) {
                break;
            }
            squirtle.attack(charmander);
        }
        charmander.resetHealth();
        squirtle.resetHealth();
        
        System.out.printf("%n%n");
        
        while(squirtle.hp > 0 && bulbasaur.hp > 0) {
            squirtle.attack(bulbasaur);
            if(bulbasaur.hp <= 0) {
                break;
            }
            bulbasaur.attack(squirtle);
        }
        squirtle.resetHealth();
        bulbasaur.resetHealth();
    }
    
}
