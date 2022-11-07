/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ecmuonlegaspi;

import java.util.ArrayList;

/**
 *
 * @author MUON
 */
public class Student {
    private String name;
    protected ArrayList<Assignment> assignments;
    
    public Student(String n, ArrayList<Assignment> a) {
        name = n;
        assignments = a;
    }
    
    public void finishAssignment(Assignment a) {
        assignments.remove(a);
    }
    
    public double getTimeNeeded() {
        int totalTimeAllotted = 0;
        
        for(Assignment a : assignments) {
            totalTimeAllotted += a.timeAllotted;
        }
        
        return totalTimeAllotted;
    }
}
