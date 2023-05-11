/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package blackjackfxmlproject;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Patric Legaspi
 */
public class PauseController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void resumeGame(Event event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.hide();
        stage.show();
    }
    @FXML
    private void backToMainMenu(Event event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Going back to main menu");
        alert.setHeaderText("You just pressed the 'Main Menu' button.");
        alert.setContentText("You will lose all of your current progress. Are you sure about this?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            thisStage.hide();
            stage.show();
        }
    }
}
