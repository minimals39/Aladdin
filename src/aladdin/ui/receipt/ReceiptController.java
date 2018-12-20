/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.receipt;

import aladdin.cart;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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
public class ReceiptController implements Initializable {
    @FXML
    private TableView<Goods> Table;
    @FXML
    private TableColumn<Goods, String> iname;
    @FXML
    private TableColumn<Goods, String> price;
    
    private ObservableList<Goods> GoodsList = FXCollections.observableArrayList();
    @FXML
    private Label total;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO

        iname.setCellValueFactory(new PropertyValueFactory<>("name"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        cart incart = cart.getInstance();
        if (!incart.getGoodsList().isEmpty()) {
            GoodsList = incart.getGoodsList();
            Table.setItems(GoodsList);
        }
        
        int sum = 0;
        
        if(!incart.getGoodsList().isEmpty()){
            int max = GoodsList.size(),i;
            System.out.println(max);
            for(i = 0; i<max ;i++){
                System.out.println(GoodsList.get(i).getPrice());
                sum += Integer.parseInt( GoodsList.get(i).getPrice());
            }
        
        
        }
        
        total.setText(""+sum);
        System.out.println("sum = " +sum);
        
    }    

    @FXML
    private void close(ActionEvent event) {
                GoodsList.clear();
                cart incart = cart.getInstance();

                incart.clear();
    }
    
}
