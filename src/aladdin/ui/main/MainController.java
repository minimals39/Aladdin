/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.main;

import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class

 * @author japan
 */
public class MainController implements Initializable {

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    ListView<String> list = new ListView<String>();
    ObservableList<String> items =FXCollections.observableArrayList (
    "Single", "Double", "Suite", "Family App");
    list.setItems(items);



    }    
    
}
