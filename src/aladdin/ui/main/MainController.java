/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
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
    @FXML
    private AnchorPane showpane;
    @FXML
    private Button account;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    Pane newLoadedPane = null;
        try {
            newLoadedPane = FXMLLoader.load(getClass().getResource("/aladdin/ui/showproduct/showproduct.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    showpane.getChildren().clear();
    showpane.getChildren().add(newLoadedPane);        
}

    @FXML
    private void initialize(ActionEvent event) {
            Pane newLoadedPane = null;
        try {
            newLoadedPane = FXMLLoader.load(getClass().getResource("/aladdin/ui/showproduct/showproduct.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    showpane.getChildren().clear();
    showpane.getChildren().add(newLoadedPane);        

    }

    private void closeStage() {
        ((Stage)logout.getScene().getWindow()).close();
    }

    @FXML
    private void search(ActionEvent event) throws IOException{
               Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/searchpage/searchpage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Search");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void checkout(ActionEvent event) throws IOException{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/checkoutpage/checkoutpage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Cart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void logout(ActionEvent event) throws IOException{
       Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/login/login.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
        closeStage();
    }

    private void category(ActionEvent event) {
       Pane newLoadedPane = null;
        try {
            newLoadedPane = FXMLLoader.load(getClass().getResource("/aladdin/ui/category/category.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    showpane.getChildren().clear();
    showpane.getChildren().add(newLoadedPane);        
    }

    @FXML
    private void account(ActionEvent event) {
               Pane newLoadedPane = null;
        try {
            newLoadedPane = FXMLLoader.load(getClass().getResource("/aladdin/ui/userinfo/userinfo.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    showpane.getChildren().clear();
    showpane.getChildren().add(newLoadedPane);        
        
    }

    @FXML
    private void yourorder(ActionEvent event) throws IOException{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/buyerorder/buyerorder.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Your Order");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    

}
