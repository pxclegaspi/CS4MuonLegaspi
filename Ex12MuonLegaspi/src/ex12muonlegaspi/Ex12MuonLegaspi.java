/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12muonlegaspi;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author MUON
 */
public class Ex12MuonLegaspi {

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
        
        ArrayList<Subject> SubjectList = new ArrayList();
        SubjectList.add(bio);
        SubjectList.add(chem);
        SubjectList.add(cs);
        SubjectList.add(math);
        SubjectList.add(physics);
        
//        JFrame frame = new JFrame();
//        frame.setTitle("Exercise 12 (Swing)");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(480, 480);
//        frame.setVisible(true);
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        SubjectLayout Layout = new SubjectLayout(3, 2, SubjectList);
        Layout.setTitle("Exercise 12 (Swing)");
        Layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Layout.setSize(480, 480);
        Layout.setUpLayout();
        Layout.setVisible(true);
        Layout.setLayout(new FlowLayout(FlowLayout.CENTER));
        
//        JButton navigateButton = new JButton("Next");
//        navigateButton.setSize(100, 100);
//        Layout.add(navigateButton);
    }
}
