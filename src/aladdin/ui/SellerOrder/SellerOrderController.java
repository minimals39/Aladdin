/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.SellerOrder;

import aladdin.SellerData;
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
        SellerData sellerdata = SellerData.getinstance();
        System.out.println(sellerdata.getName());
        String Owner = sellerdata.getName();

        while (true) {
            String sql = "SELECT * FROM aladdin.order WHERE no= " + number;
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();
            if (data == null || number > 40) {
                break;
            }
            for (Object object : data) {
                Map row = (Map) object;
                String buyer = (String) row.get("customer");
                String price = (String) row.get("Price");
                String quan = (String) row.get("Quantity");
                String owner = (String) row.get("seller");
                String DT = (String) row.get("Detail");
                String adds = (String) row.get("Address");
                String name = (String) row.get("Name");

                if (Owner.equals(owner)) {
                    GoodsList.add(new Order(price,owner, buyer ,adds ,name));
                    System.out.println(" "+ adds +" "+ buyer + " " + name);
                    //public Order(String Price, String Seller, String Customer)
                } else {
                    System.out.println("" + Owner);
                    System.out.println(" " + owner);
                }
//               Goods(String name, String price, String detail, String seller, String quantity)

            }
            number++;
        }
    }
}
