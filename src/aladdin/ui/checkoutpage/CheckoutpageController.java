/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.checkoutpage;

import aladdin.CustomerData;
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
import org.apache.maven.Customer;
import org.apache.maven.Goods;
import org.apache.maven.Order;
import org.apache.persistence.HibernateUtil;
import org.hibernate.Session;

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

    private ObservableList<Goods> GoodsList = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        iname.setCellValueFactory(new PropertyValueFactory<>("name"));
        iprice.setCellValueFactory(new PropertyValueFactory<>("price"));
        cart incart = cart.getInstance();
        if (!incart.getGoodsList().isEmpty()) {
            GoodsList = incart.getGoodsList();
            Table.setItems(GoodsList);
        }
        
        if(!incart.getGoodsList().isEmpty()){
            int max = GoodsList.size(),i;
            System.out.println(max);
            for(i = 0; i<max ;i++){
                System.out.println(GoodsList.get(i).getPrice());
            }
        
        
        }
        
    }

    @FXML
    private void checkOut(ActionEvent event) {
        /*
        iterate ingoodlist to db
         */
        cart incart = cart.getInstance();
        if(!incart.getGoodsList().isEmpty()){
            int max = GoodsList.size(),i;
            System.out.println(max);
            
            
            
            
            
            for(i = 0; i<max ;i++){
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                Order makeorder = new Order();
                CustomerData customerData = CustomerData.getInstance();
                makeorder.setAddress(customerData.getAddress());
                makeorder.setCustomer(customerData.getName());
                makeorder.setPrice(GoodsList.get(i).getPrice());
                makeorder.setSeller(GoodsList.get(i).getSeller());
                makeorder.setName(GoodsList.get(i).getName());
                //System.out.println(GoodsList.get(i).getPrice());
                session.save(makeorder);
                session.getTransaction().commit();
            }
        
        
        }
            
        ////
        GoodsList.clear();
        incart.clear();
       
    }

    @FXML
    private void cancel(ActionEvent event) {
        GoodsList.clear();
        cart incart = cart.getInstance();
        incart.clear();
    }

}
