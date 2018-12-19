/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.sellerproduct;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.apache.maven.Goods;
import javafx.scene.control.cell.PropertyValueFactory;



/**
 * FXML Controller class
 *
 * @author japan
 */
public class SellerproductController implements Initializable {

    @FXML
    private TableView<Goods> Table;
    @FXML
    private TableColumn<Goods, String> PdName;
    @FXML
    private TableColumn<Goods, String> PdPrice;
    @FXML
    private TableColumn<Goods, String> PdStatus;
    
    private ObservableList<Goods> GoodsList = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
        PdName.setCellValueFactory(new PropertyValueFactory<>("name"));
        PdPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        PdStatus.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        //add your data to the table here.
        Table.setItems(GoodsList);
        
    }
    
    private void Load(){
        /*
        loop backend to get goods
        while(goods from backend){
        String gname = goods.name
        String price = goods,price
        String quan = goods.quan    
        
        GoodsList.add(new Goods(name,price,quan));
        }
        */

    
    }
}
