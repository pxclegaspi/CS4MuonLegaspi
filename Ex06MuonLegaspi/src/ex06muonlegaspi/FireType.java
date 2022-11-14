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
public class FireType extends Monster {
    public FireType(String n, String t, String s, String w, int m, int base) {
        super(n, "fire", "grass", "water", m, base);
        
        atk = (int) (1.3 * base);
        def = (int) (0.7 * base);
    }
    
    public void special(String type) {
        System.out.println(name + " did a pose.");
        atk += 2;
        hp -= 0.1 * maxHP;
    }
}
