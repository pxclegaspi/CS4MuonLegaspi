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
public class WaterType extends Monster {
    public WaterType(String n, String t, String s, String w, int m, int base) {
        super(n, "water", "fire", "grass", m, base);
        
        atk = (int) (0.7 * base);
        def = (int) (1.3 * base);
    }
    
    public void special(String type) {
        def += 2;
        hp -= 0.1 * maxHP;
    }
}
