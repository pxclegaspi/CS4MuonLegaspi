/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12muonlegaspi;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author MUON
 */
public class SubjectGridLayout extends JFrame {
    protected int rows;
    protected int columns;
    protected ArrayList SubjectList;
    
    public SubjectGridLayout(int r, int c, ArrayList SL) {
        rows = r;
        columns = c;
        SubjectList = SL;
    }
    
    public void setUpLayout() {
        this.setLayout((LayoutManager) new GridLayout(rows, columns));
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(SubjectList.size() < 2*i + j + 1) {
                    break;
                }
                Subject currentSubject = (Subject) SubjectList.get(2*i+j);
                JLabel currentSubjectLabel = new JLabel();
                
                Border subjectBorder = BorderFactory.createLineBorder(Color.black, 1);
                currentSubjectLabel.setBorder(subjectBorder);
                
                ImageIcon img = new ImageIcon(Ex12MuonLegaspi.class.getResource(currentSubject.getImgFileName()));
                currentSubjectLabel.setIcon(img);
                currentSubjectLabel.setText("Name: " + currentSubject.getName() + " -- Units: " + currentSubject.getUnits() + " -- Grade: " + currentSubject.getGrade());
                currentSubjectLabel.setHorizontalTextPosition(JLabel.CENTER);
                currentSubjectLabel.setVerticalTextPosition(JLabel.BOTTOM);
                this.add(currentSubjectLabel);
            }
        }
    }
}

//