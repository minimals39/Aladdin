/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.SellerOrder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class SellerOrderController implements Initializable {
    @FXML
    private TableColumn<?, ?> iname;
    @FXML
    private TableColumn<?, ?> buyer;
    @FXML
    private TableColumn<?, ?> buyeraddr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
