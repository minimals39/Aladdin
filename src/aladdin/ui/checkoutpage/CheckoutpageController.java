/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.checkoutpage;

import aladdin.cart;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.maven.Goods;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class CheckoutpageController implements Initializable {
    @FXML
    private Label total;
    @FXML
    private TableColumn<Goods, String> iname;
    @FXML
    private TableColumn<Goods, String> iprice;
    @FXML
    private TableView<Goods> Table;

    private ObservableList<Goods> GoodsList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        iname.setCellValueFactory(new PropertyValueFactory<>("name"));
        iprice.setCellValueFactory(new PropertyValueFactory<>("price"));
        cart incart = cart.getInstance();
        if(!incart.getGoodsList().isEmpty()){ 
        GoodsList = incart.getGoodsList();
        Table.setItems(GoodsList);
        }
    }    

    @FXML
    private void checkOut(ActionEvent event) {
        /*
        iterate ingoodlist to db
        
        */
        GoodsList.clear();
        cart incart = cart.getInstance();
        incart.clear();
    }

    @FXML
    private void cancel(ActionEvent event) {
        GoodsList.clear();
        cart incart = cart.getInstance();
        incart.clear();
    }
    
}
