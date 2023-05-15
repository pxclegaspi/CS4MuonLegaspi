/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package blackjackfxmlproject;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Patric Legaspi
 */
public class MainMenuController implements Initializable {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    
//    @FXML
//    private Label label;
//    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML private Label welcome;
    @FXML private ImageView mainMenuPicture;
    @FXML private Button playButton, settingsButton, quitButton;
    
    @FXML
    private void playGame(Event event) throws IOException {

//        
//        Optional<String> result = dialog0.showAndWait();
//        if (result.isPresent()){
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
//            Parent root = loader.load();
//            Stage stage = new Stage();
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
//            thisStage.hide();
//            stage.show();
//        }
        TextInputDialog dialog0 = new TextInputDialog("1");
        dialog0.setTitle("Number of Players");
        dialog0.setHeaderText("You goin' alone or with friends?");
        dialog0.setContentText("Enter the number of players to play.");
        Optional<String> playerResult = dialog0.showAndWait();
        if (playerResult.isPresent()) {
            System.out.println(playerResult);
            int numberOfPlayers = Integer.parseInt(playerResult.toString());
            dialog0.close();
            for(int i = 0; i < numberOfPlayers; i++) {
                TextInputDialog dialog1 = new TextInputDialog();
                dialog1.setTitle("Initial Money");
                dialog1.setHeaderText("You don't wanna be broke, do you?");
                dialog1.setContentText("Player " + Integer.toString(i + 1) + ", enter your name and the amount of money you will have at the start of the game.");
                TextField name = new TextField();
                TextField money = new TextField();
                
                Optional<String> nameResult = dialog1.showAndWait();
                //if (nameResult.isPresent() && moneyResult.isPresent()) {
                //    Player addedPlayer = new Player(nameResult.toString(), Double.parseDouble(moneyResult.toString()));
                //}
            }
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            thisStage.hide();
            stage.show();
        }

        // The Java 8 way to get the response value (with lambda expression).
        //result.ifPresent(name -> System.out.println("Your name: " + name));
    }
    @FXML
    private void quitGame(Event event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Quitting the game");
        alert.setHeaderText("You just pressed the 'Quit' button.");
        alert.setContentText("Are you sure about this?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            thisStage.close();
        }
    }
}
