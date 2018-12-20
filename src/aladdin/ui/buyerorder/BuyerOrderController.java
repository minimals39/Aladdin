/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.buyerorder;

import java.net.URL;
import java.util.List;
import java.util.Map;
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
import org.apache.persistence.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class BuyerOrderController implements Initializable {
    @FXML
    private TableView<Order> Table;
    @FXML
    private TableColumn<Order, String> iname;
    @FXML
    private TableColumn<Order, String> price;
    
    private ObservableList<Order> GoodsList = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        iname.setCellValueFactory(new PropertyValueFactory<>("name"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        Load();
        Table.setItems(GoodsList);
    }    
        private void Load() {
            
            /*
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int number = 1;
        while (true) {
            String sql = "SELECT * FROM aladdin.Goods WHERE no= " + number;
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();
            if (data == null || number > 20){break;}
            for (Object object : data) {
                
                Map row = (Map) object;
                String name = (String) row.get("Name");
                String price = (String) row.get("Price");
                String quan = (String) row.get("Quantity");
                String owner = (String) row.get("Seller");
                String DT = (String) row.get("Detail");
                
               
                GoodsList.add(new Goods(name, price, DT, owner, quan));
//               Goods(String name, String price, String detail, String seller, String quantity)
                 

            }
            number++;*/
        }

}
