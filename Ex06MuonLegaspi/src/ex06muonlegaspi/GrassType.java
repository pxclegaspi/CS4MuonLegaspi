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
public class GrassType extends Monster {
    public GrassType(String n, String t, String s, String w, int m, int base) {
        super(n, "grass", "water", "fire", m, base);
    }
    
    public void special(String type) {
        if(hp < 0.8 * maxHP) {
            hp += 0.2 * maxHP;
        } else {
            hp = maxHP;
        }
    }
}
