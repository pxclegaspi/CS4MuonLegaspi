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
public class SubjectLayout extends JFrame {
    protected int rows;
    protected int columns;
    protected ArrayList SubjectList;
    protected ArrayList BorderPanelList;
    
    public SubjectLayout(int r, int c, ArrayList SL, ArrayList BPL) {
        rows = r;
        columns = c;
        SubjectList = SL;
        BorderPanelList = BPL;
    }
    
    public void setUpLayout() {
        for(int i = 0; i < BorderPanelList.size(); i++) {
            JPanel currentPanel = (JPanel) BorderPanelList.get(i);
            currentPanel.setLayout((LayoutManager) new GridLayout(rows, columns));
            
            for(int j = 0; j < rows; j++) {
                for(int k = 0; k < columns; k++) {
                    if(SubjectList.size() < 2*j + k + 1) {
                        break;
                    }
                    Subject currentSubject = (Subject) SubjectList.get(2*j+k);
                    JLabel currentSubjectLabel = new JLabel();

                    Border subjectBorder = BorderFactory.createLineBorder(Color.black, 1);
                    currentSubjectLabel.setBorder(subjectBorder);

                    ImageIcon img = new ImageIcon(Ex12MuonLegaspi.class.getResource(currentSubject.getImgFileName()));
                    currentSubjectLabel.setIcon(img);
                    currentSubjectLabel.setText("Name: " + currentSubject.getName() + " -- Units: " + currentSubject.getUnits() + " -- Grade: " + currentSubject.getGrade());
                    currentSubjectLabel.setHorizontalTextPosition(JLabel.CENTER);
                    currentSubjectLabel.setVerticalTextPosition(JLabel.BOTTOM);
                    currentPanel.add(currentSubjectLabel);
                    }
            }
        }
    }
}
