/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11muonlegaspi;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author MUON
 */
public class SubjectLayout extends JFrame {
    protected int rows;
    protected int columns;
    protected ArrayList SubjectList;
    
    public SubjectLayout(int r, int c, ArrayList SL) {
        rows = r;
        columns = c;
        SubjectList = SL;
        
        this.setLayout((LayoutManager) new GridLayout(rows, columns));
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                
            }
        }
    }
}
