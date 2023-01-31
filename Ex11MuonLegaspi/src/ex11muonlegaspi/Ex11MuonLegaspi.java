/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11muonlegaspi;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author MUON
 */
public class Ex11MuonLegaspi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Subject math = new Subject("Math", "../media/math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "../media/biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "../media/chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "../media/physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "../media/computer science.png", 1, 1.5);
        
        Subject displayedSubject = math;
        
        JFrame frame = new JFrame();
        frame.setTitle("Exercise 11 (Swing)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 480);
        frame.setVisible(true);
        
        JLabel displayedSubjectLabel = new JLabel();
        frame.add(displayedSubjectLabel);
        
        ImageIcon displayedSubjectImage = new ImageIcon(displayedSubject.getImgFileName());
        String displayedSubjectName = displayedSubject.getName();
        double displayedSubjectUnits = displayedSubject.getUnits();
        double displayedSubjectGrade = displayedSubject.getGrade();
        
        displayedSubjectLabel.setIcon(displayedSubjectImage);
        displayedSubjectLabel.setText(displayedSubjectName);
        displayedSubjectLabel.setText(Double.toString(displayedSubjectUnits));
        displayedSubjectLabel.setText(Double.toString(displayedSubjectGrade));
    }
    
}
