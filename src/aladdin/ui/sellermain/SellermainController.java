/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.sellermain;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class SellermainController implements Initializable {
    @FXML
    private AnchorPane showpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void loadFxml (ActionEvent event) throws IOException  {
    Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("/aladdin/ui/sellerinfo/sellinfo.fxml"));
    showpane.getChildren().clear();
    showpane.getChildren().add(newLoadedPane);
}

    @FXML
    private void initialize(ActionEvent event) {
    }

    @FXML
    private void addproduct(ActionEvent event) throws IOException{
                
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/addproduct/addproduct.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void checkproduct(ActionEvent event) throws IOException {
    Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("/aladdin/ui/sellerproduct/sellerproduct.fxml"));
    showpane.getChildren().clear();
    showpane.getChildren().add(newLoadedPane);

        
    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
       Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/login/login.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        closeStage();
        
    }
            private void closeStage() {
        ((Stage)showpane.getScene().getWindow()).close();
    }

    @FXML
    private void order(ActionEvent event) throws IOException{
    Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("/aladdin/ui/order/order.fxml"));
    showpane.getChildren().clear();
    showpane.getChildren().add(newLoadedPane);

        
        
    }

    
}
