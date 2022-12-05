/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex09muonlegaspi;

/**
 *
 * @author MUON
 */
class FullTeamException extends Exception {
    public FullTeamException() {
        
    }
    public FullTeamException(Trainer t) {
        System.out.printf("%s already has 6 Monsters.", t.getName());
    }
}
