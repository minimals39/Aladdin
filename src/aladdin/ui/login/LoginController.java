/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class LoginController implements Initializable {
    @FXML
    private Button loginbutton;
    @FXML
    private RadioButton buyer;
    @FXML
    private ToggleGroup type;
    @FXML
    private RadioButton seller;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loginbutton.setDisable(true);

    }    

    @FXML
    private void login(ActionEvent event) throws IOException {
        try{
       if(buyer.isSelected()){     
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/main/main.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        closeStage();}
       else if(seller.isSelected()){
       Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/sellermain/sellermain.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        closeStage();
       
       }
        }
        
        catch(Exception e){
            System.out.println("Cant load new window");
        }
    }
    
        private void closeStage() {
        ((Stage)loginbutton.getScene().getWindow()).close();
    }

    @FXML
    private void register(ActionEvent event) throws IOException{
        
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/register/register.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        closeStage();
    }

    @FXML
    private void tick(ActionEvent event) {
        loginbutton.setDisable(false);
    }
    
}
