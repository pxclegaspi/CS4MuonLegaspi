/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package blackjackfxmlproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Patric Legaspi
 */
public class BlackjackFXMLProject extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Card AceC = new Card("Ace", "Clubs", "media/PNG-cards-1.3/ace_of_clubs.png", 1);
        Card AceS = new Card("Ace", "Spades", "media/PNG-cards-1.3/ace_of_spades.png", 1);
        Card AceH = new Card("Ace", "Hearts", "media/PNG-cards-1.3/ace_of_hearts.png", 1);
        Card AceD = new Card("Ace", "Diamonds", "media/PNG-cards-1.3/ace_of_diamonds.png", 1);
        Card TwoC = new Card("Two", "Clubs", "media/PNG-cards-1.3/2_of_clubs.png", 2);
        Card TwoS = new Card("Two", "Spades", "media/PNG-cards-1.3/2_of_spades.png", 2);
        Card TwoH = new Card("Two", "Hearts", "media/PNG-cards-1.3/2_of_hearts.png", 2);
        Card TwoD = new Card("Two", "Diamonds", "media/PNG-cards-1.3/2_of_diamonds.png", 2);
        Card ThreeC = new Card("Three", "Clubs", "media/PNG-cards-1.3/3_of_clubs.png", 3);
        Card ThreeS = new Card("Three", "Spades", "media/PNG-cards-1.3/3_of_spades.png", 3);
        Card ThreeH = new Card("Three", "Hearts", "media/PNG-cards-1.3/3_of_hearts.png", 3);
        Card ThreeD = new Card("Three", "Diamonds", "media/PNG-cards-1.3/3_of_diamonds.png", 3);
        Card FourC = new Card("Four", "Clubs", "media/PNG-cards-1.3/4_of_clubs.png", 4);
        Card FourS = new Card("Four", "Spades", "media/PNG-cards-1.3/4_of_spades.png", 4);
        Card FourH = new Card("Four", "Hearts", "media/PNG-cards-1.3/4_of_hearts.png", 4);
        Card FourD = new Card("Four", "Diamonds", "media/PNG-cards-1.3/4_of_diamonds.png", 4);
        Card FiveC = new Card("Five", "Clubs", "media/PNG-cards-1.3/5_of_clubs.png", 5);
        Card FiveS = new Card("Five", "Spades", "media/PNG-cards-1.3/5_of_spades2.png", 5);
        Card FiveH = new Card("Five", "Hearts", "media/PNG-cards-1.3/5_of_hearts.png", 5);
        Card FiveD = new Card("Five", "Diamonds", "media/PNG-cards-1.3/5_of_diamonds.png", 5);
        Card SixC = new Card("Six", "Clubs", "media/PNG-cards-1.3/6_of_clubs.png", 6);
        Card SixS = new Card("Six", "Spades", "media/PNG-cards-1.3/6_of_spades.png", 6);
        Card SixH = new Card("Six", "Hearts", "media/PNG-cards-1.3/6_of_hearts.png", 6);
        Card SixD = new Card("Six", "Diamonds", "media/PNG-cards-1.3/6_of_diamonds.png", 6);
        Card SevenC = new Card("Seven", "Clubs", "media/PNG-cards-1.3/7_of_clubs.png", 7);
        Card SevenS = new Card("Seven", "Spades", "media/PNG-cards-1.3/7_of_spades.png", 7);
        Card SevenH = new Card("Seven", "Hearts", "media/PNG-cards-1.3/7_of_hearts.png", 7);
        Card SevenD = new Card("Seven", "Diamonds", "media/PNG-cards-1.3/7_of_diamonds.png", 7);
        Card EightC = new Card("Eight", "Clubs", "media/PNG-cards-1.3/8_of_clubs.png", 8);
        Card EightS = new Card("Eight", "Spades", "media/PNG-cards-1.3/8_of_spades.png", 8);
        Card EightH = new Card("Eight", "Hearts", "media/PNG-cards-1.3/8_of_hearts.png", 8);
        Card EightD = new Card("Eight", "Diamonds", "media/PNG-cards-1.3/8_of_diamonds.png", 8);
        Card NineC = new Card("Nine", "Clubs", "media/PNG-cards-1.3/9_of_clubs.png", 9);
        Card NineS = new Card("Nine", "Spades", "media/PNG-cards-1.3/9_of_spades.png", 9);
        Card NineH = new Card("Nine", "Hearts", "media/PNG-cards-1.3/9_of_hearts.png", 9);
        Card NineD = new Card("Nine", "Diamonds", "media/PNG-cards-1.3/9_of_diamonds.png", 9);
        Card TenC = new Card("Ten", "Clubs", "media/PNG-cards-1.3/10_of_clubs.png", 10);
        Card TenS = new Card("Ten", "Spades", "media/PNG-cards-1.3/10_of_spades.png", 10);
        Card TenH = new Card("Ten", "Hearts", "media/PNG-cards-1.3/10_of_hearts.png", 10);
        Card TenD = new Card("Ten", "Diamonds", "media/PNG-cards-1.3/10_of_diamonds.png", 10);
        Card JackC = new Card("Jack", "Clubs", "media/PNG-cards-1.3/jack_of_clubs.png", 10);
        Card JackS = new Card("Jack", "Spades", "media/PNG-cards-1.3/jack_of_spades.png", 10);
        Card JackH = new Card("Jack", "Hearts", "media/PNG-cards-1.3/jack_of_hearts.png", 10);
        Card JackD = new Card("Jack", "Diamonds", "media/PNG-cards-1.3/jack_of_diamonds.png", 10);
        Card QueenC = new Card("Queen", "Clubs", "media/PNG-cards-1.3/queen_of_clubs.png", 10);
        Card QueenS = new Card("Queen", "Spades", "media/PNG-cards-1.3/queen_of_spades.png", 10);
        Card QueenH = new Card("Queen", "Hearts", "media/PNG-cards-1.3/queen_of_hearts.png", 10);
        Card QueenD = new Card("Queen", "Diamonds", "media/PNG-cards-1.3/queen_of_diamonds.png", 10);
        Card KingC = new Card("King", "Clubs", "media/PNG-cards-1.3/king_of_clubs.png", 10);
        Card KingS = new Card("King", "Spades", "media/PNG-cards-1.3/king_of_spades.png", 10);
        Card KingH = new Card("King", "Hearts", "media/PNG-cards-1.3/king_of_hearts.png", 10);
        Card KingD = new Card("King", "Diamonds", "media/PNG-cards-1.3/king_of_diamonds.png", 10);
        
        Parent root = FXMLLoader.load(getClass()
                .getResource("MainMenu.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
