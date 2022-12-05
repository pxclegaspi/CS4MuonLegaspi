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
class NotInTeamException extends Exception {
    public NotInTeamException() {
        
    }
    public NotInTeamException(Trainer t, Monster m) {
        System.out.printf("%s doesn't have %s.", t.getName(), m.getName());
    }
}
