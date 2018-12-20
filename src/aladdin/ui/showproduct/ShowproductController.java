/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.showproduct;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.apache.maven.Goods;
import org.apache.persistence.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class ShowproductController implements Initializable {
    @FXML
    private TableView<Goods> Table;
    @FXML
    private TableColumn<Goods, String> iname;
    @FXML
    private TableColumn<Goods, String> info;
    @FXML
    private TableColumn<Goods, String> price;
    @FXML
    private TableColumn<Goods, String> action;
    
    private ObservableList<Goods> GoodsList = FXCollections.observableArrayList();

 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
                //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
        iname.setCellValueFactory(new PropertyValueFactory<>("name"));
        info.setCellValueFactory(new PropertyValueFactory<>("price"));
        price.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        action.setCellValueFactory(new PropertyValueFactory<>("addtocart"));

        //add your data to the table here.
        Load();
        
        Table.setItems(GoodsList);
    }    
        private void itemwindow(MouseEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/itempage/itempage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void Load() {
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
                
               
                GoodsList.add(new Goods(name, price, DT, owner, DT));
//               Goods(String name, String price, String detail, String seller, String quantity)
                 

            }
            number++;
        }
    
}


}
