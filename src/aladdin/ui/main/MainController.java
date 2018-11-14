/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.main;

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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class

 * @author japan
 */

public class MainController implements Initializable {
    private Button info;
    @FXML
    private Button search;
    @FXML
    private Button logout;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {    
}

    @FXML
    private void initialize(ActionEvent event) {
    }

    @FXML
    private void itemwindow(MouseEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/itempage/itempage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void closeStage() {
        ((Stage)logout.getScene().getWindow()).close();
    }

    @FXML
    private void search(ActionEvent event) throws IOException{
               Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/searchpage/searchpage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void checkout(ActionEvent event) throws IOException{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/checkoutpage/checkoutpage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void logout(ActionEvent event) throws IOException{
       Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/login/login.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        closeStage();
    }

    @FXML
    private void category(ActionEvent event) {
        
    }

    
    

}
