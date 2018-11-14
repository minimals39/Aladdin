/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.register;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class RegisterController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField pass;
    @FXML
    private PasswordField passcheck;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private RadioButton buyer;
    @FXML
    private ToggleGroup usertype;
    @FXML
    private RadioButton seller;
    @FXML
    private Button confirm;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        confirm.setDisable(true);
    }

    @FXML
    private void isBuyer(ActionEvent event) {
        confirm.setDisable(false);

    }

    @FXML
    private void isSeller(ActionEvent event) {
        confirm.setDisable(false);
    }

    @FXML
    private void confirm(ActionEvent event) throws IOException {
        if (buyer.isSelected()) {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/main/main.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
            closeStage();

        }
        else if (seller.isSelected()){
           Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/sellermain/sellermain.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
            closeStage();
        
        }
    }

    private void closeStage() {
        ((Stage) confirm.getScene().getWindow()).close();
    }

}
