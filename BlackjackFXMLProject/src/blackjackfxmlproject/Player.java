/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackfxmlproject;

import java.util.ArrayList;

/**
 *
 * @author Patric Legaspi
 */
public class Player {
    private String name;
    private double money;
    private ArrayList HandList = new ArrayList();
    
    public String getName() {
        return name;
    }
    public double getMoney() {
        return money;
    }
    public ArrayList getHandList() {
        return HandList;
    }
}
