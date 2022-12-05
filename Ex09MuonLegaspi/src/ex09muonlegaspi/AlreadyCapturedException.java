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
public class AlreadyCapturedException extends Exception {
    public AlreadyCapturedException() {
        
    }
    public AlreadyCapturedException(String message) {
        super(message);
    }
    public AlreadyCapturedException(Trainer t, Monster m) {
        System.out.printf("%s already captured %s before.", t.getName(), m.getName());
    }
}
