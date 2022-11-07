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
public class Section {
    private String name;
    protected ArrayList<Student> students;
    
    public Section (String n, ArrayList<Student> st) {
        name = n;
        students = st;
    }
    
    public void addStudent(Student s) {
        students.add(s);
    }
}
