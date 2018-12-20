/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.sellerproduct;

import aladdin.SellerData;
import java.util.*;
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
import org.apache.persistence.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.*;

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
            String sql = "SELECT * FROM aladdin.Goods WHERE no= " + number;
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();
            if (data == null || number > 40) {
                break;
            }
            for (Object object : data) {
                Map row = (Map) object;
                String name = (String) row.get("Name");
                String price = (String) row.get("Price");
                String quan = (String) row.get("Quantity");
                String owner = (String) row.get("Seller");
                String DT = (String) row.get("Detail");

                if (Owner.equals(owner)) {
                    GoodsList.add(new Goods(name, price, quan, owner, DT));
                }
                else
                {
                    System.out.println(""+Owner );
                    System.out.println(" "+owner );
                }
//               Goods(String name, String price, String detail, String seller, String quantity)

            }
            number++;
        }
    }
}

   
