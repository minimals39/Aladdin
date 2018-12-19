/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.userinfo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class UserinfoController implements Initializable {
    @FXML
    private ImageView profpic;
    @FXML
    private TextField Name;
    @FXML
    private TextField Surname;
    @FXML
    private TextArea Address;
    @FXML
    private TextField card;
    @FXML
    private TextField SN;
    @FXML
    private Button edit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Name.setDisable(true);
        Surname.setDisable(true);
        Address.setDisable(true);
        card.setDisable(true);
        SN.setDisable(true);
        
        String name = "";
        String surname = "";
        String Address = "";
        String card = "";
        String sec = "";
        
        Name.setText(name);
        Name.setText(surname);
        Name.setText(Address);
        Name.setText(card);
        Name.setText(sec);
        // TODO
    }    

    @FXML
    private void pic(ActionEvent event) {
    }

    @FXML
    private void edit(ActionEvent event) {
         Name.setDisable(false);
        Surname.setDisable(false);
        Address.setDisable(false);
        card.setDisable(false);
        SN.setDisable(false);
        
        //to do
    }
    
}
