/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.sellerinfo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class SellinfoController implements Initializable {
    @FXML
    private Button editbutton;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextArea information;
    @FXML
    private TextField bank;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        name.setDisable(true);
        surname.setDisable(true);
        information.setDisable(true);
        bank.setDisable(true);
        
        String sname = "";
        String ssurname = "";
        String info = "";
        String card = "";
        
        name.setText(sname);
        surname.setText(ssurname);
        information.setText(info);
        bank.setText(card);
    }    

    @FXML
    private void edit(ActionEvent event) {
        name.setDisable(false);
        surname.setDisable(false);
        information.setDisable(false);
        bank.setDisable(false);
    }
    
}
