/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackproject;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author MUON
 */
public class BlackjackMainMenu extends JFrame {

    /**
     *
     */
    public BlackjackMainMenu() {
        super("Blackjack Main Menu");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        JLabel title = new JLabel();
        title.setText("Welcome to Blackjack!");
        ImageIcon img = new ImageIcon(BlackjackProject.class.getResource("../media/main menu background image.jpg"));
        title.setIcon(img);
        ImageIcon resizedImage = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        this.add(title);
        
        JButton playButton = new JButton("Play");
        playButton.setSize(20, 70);
        this.add(playButton);
        
        JButton exitButton = new JButton("Exit");
        exitButton.setSize(20, 70);
        this.add(exitButton);
    }
//    
}

