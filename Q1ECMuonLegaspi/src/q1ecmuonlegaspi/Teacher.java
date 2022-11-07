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
public class Teacher {
    private String name;
    private String subject;
    private ArrayList<Section> sections;
    
    public Teacher (String n, String su, ArrayList<Section> se) {
        name = n;
        subject = su;
        sections = se;
    }
    
    public void giveAssignment(Assignment a) {
        for(Section se : sections) {
            for(Student st : se.students) {
                st.assignments.add(a);
            }
        }
    }
}
