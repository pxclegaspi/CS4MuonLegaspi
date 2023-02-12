/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11to12muonlegaspi;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author MUON
 */
public class Ex11To12MuonLegaspi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Subject bio = new Subject("Biology", "../media/biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "../media/chemistry.png", 3, 1.5);
        Subject cs = new Subject("CS", "../media/computer science.png", 1, 1.5);
        Subject math = new Subject("Math", "../media/math.png", 4, 1.75);
        Subject physics = new Subject("Physics", "../media/physics.png", 3, 1.75);
        
        Subject displayedSubject = math;
        
        ArrayList<Subject> SubjectList = new ArrayList();
        SubjectList.add(bio);
        SubjectList.add(chem);
        SubjectList.add(cs);
        SubjectList.add(math);
        SubjectList.add(physics);
        
        JFrame frame = new JFrame();
        frame.setTitle("Exercise 11 (Swing)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 480);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JLabel displayedSubjectLabel = new JLabel();
        ImageIcon img = new ImageIcon(Ex11To12MuonLegaspi.class.getResource(displayedSubject.getImgFileName()));
        displayedSubjectLabel.setIcon(img);
        displayedSubjectLabel.setText("Name: " + displayedSubject.getName() + " -- Units: " + displayedSubject.getUnits() + " -- Grade: " + displayedSubject.getGrade());
        displayedSubjectLabel.setHorizontalTextPosition(JLabel.CENTER);
        displayedSubjectLabel.setVerticalTextPosition(JLabel.BOTTOM);
        frame.add(displayedSubjectLabel);
        
        JButton navigateButton = new JButton("Next");
        navigateButton.setSize(100, 100);
        frame.add(navigateButton);
    }
    
}
