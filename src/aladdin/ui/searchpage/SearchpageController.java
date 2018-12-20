/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.searchpage;

import aladdin.SellerData;
import java.net.URL;
import java.util.List;
import java.util.Map;
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
import org.apache.persistence.HibernateUtil;
import org.hibernate.*;

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
    private void Load() {
        String sql = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int number = 1;
        SellerData sellerdata = SellerData.getinstance();
        System.out.println(sellerdata.getName());
        String Owner = sellerdata.getName();
        String newString = "\'%"+ keyW.getText() + "%\'";


            if (keyW.getText().isEmpty()) {
                sql = "SELECT * FROM aladdin.Goods WHERE no= " + number;
            }
            else {
                sql = "SELECT * FROM aladdin.Goods WHERE name LIKE "+newString;
            }          
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();
            for (Object object : data) {
                Map row = (Map) object;
                String name = (String) row.get("Name");
                String price = (String) row.get("Price");
                String quan = (String) row.get("Quantity");
                String owner = (String) row.get("Seller");
                String DT = (String) row.get("Detail");

                
                GoodsList.add(new Goods(name, price, quan, owner, DT));
                
                
//               Goods(String name, String price, String detail, String seller, String quantity)

            }
            number++;
        
    }
    @FXML
    private void search(ActionEvent event) {
        Load();
        Table.setItems(GoodsList);
    }
    
}
