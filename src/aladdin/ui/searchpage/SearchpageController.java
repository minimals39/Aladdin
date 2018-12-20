/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.searchpage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.maven.Goods;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class SearchpageController implements Initializable {
    @FXML
    private TextField keyW;
    @FXML
    private TableColumn<Goods, String> name;
    @FXML
    private TableColumn<Goods, String> price;
    @FXML
    private TableColumn<Goods, String> info;
    @FXML
    private Button search;
    
    private ObservableList<Goods> GoodsList = FXCollections.observableArrayList();
    @FXML
    private TableView<Goods> Table;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        info.setCellValueFactory(new PropertyValueFactory<>("detail"));
        
        Table.setItems(GoodsList);
    }    

    @FXML
    private void search(ActionEvent event) {
    }
    
}
