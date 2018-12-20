/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.SellerOrder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.maven.Goods;
import org.apache.maven.Order;
import org.hibernate.*;
import org.apache.persistence.HibernateUtil;
import aladdin.SellerData;
import java.util.*;
import java.net.URL;
import java.util.ResourceBundle;




/**
 * FXML Controller class
 *
 * @author japan
 */
public class SellerOrderController implements Initializable {
    @FXML
    private TableColumn<Order, String> iname;
    @FXML
    private TableColumn<Order, String> buyer;
    @FXML
    private TableColumn<Order, String> buyeraddr;
    private ObservableList<Order> GoodsList = FXCollections.observableArrayList();
    @FXML
    private TableView<Order> Table;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
                // TODO
        iname.setCellValueFactory(new PropertyValueFactory<>("name"));
        buyer.setCellValueFactory(new PropertyValueFactory<>("buyer"));
        buyeraddr.setCellValueFactory(new PropertyValueFactory<>("addressindb")); 
        Load();
        Table.setItems(GoodsList);
    }    
    
    private void Load() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int number = 1;
        while (true) {
            String sql = "SELECT * FROM aladdin.Order WHERE no= " + number;
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();
            if (data == null || number > 20){break;}
            for (Object object : data) {
                
                Map row = (Map) object;
                String Name = (String) row.get("Name");
                String Price = (String) row.get("Price");
                String Seller = (String) row.get("Seller");
                String Customer = (String) row.get("Customer");
                String Address = (String) row.get("Address");
                
            }
            number++;
            
        }
    }
}
           
