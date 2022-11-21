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
public class GrassType extends Monster {
    public GrassType(String n, String t, String s, String w, int m, int base) {
        super(n, "grass", "water", "fire", m, base);
    }
    
    public void rest() {
        hp += maxHP * 0.5;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
    
    public void special(String type) {
        System.out.println(name + " did a pose.");
        if(hp < 0.8 * maxHP) {
            hp += 0.2 * maxHP;
        } else {
            hp = maxHP;
        }
    }
}
