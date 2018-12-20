/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.userinfo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import aladdin.CustomerData;
import java.util.List;
import java.util.Map;
import org.apache.persistence.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
/**
 * FXML Controller class
 *
 * @author japan
 */
public class UserinfoController implements Initializable {
    @FXML
    private TextField Name;
    @FXML
    private TextField Surname;
    @FXML
    private TextArea Address;
    @FXML
    private TextField card;
    @FXML
    private TextField SN;
    @FXML
    private Button edit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Name.setDisable(true);
        Surname.setDisable(true);
        Address.setDisable(true);
        card.setDisable(true);
        SN.setDisable(true);
        
        
        
        CustomerData customerData = CustomerData.getInstance();
        System.out.println(customerData.getName());
        String newString = '\''+ customerData.getName() + '\'';
        String sql = "SELECT * FROM aladdin.Customer WHERE Name= "+ newString;
        System.out.println("4");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Can We get here 2");
        session.beginTransaction();
        
        
        
        SQLQuery query = session.createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List data = query.list();
        for (Object object : data) {
            Map row = (Map) object;
            /*inName.setText(""+row.get("Name"));
            InSurname.setText(""+row.get("Surname"));*/
            Name.setText(customerData.getName());
            Surname.setText(""+row.get("Surname"));
            card.setText(""+row.get("payment"));
            Address.setText(""+row.get("Address"));
        }
        
        
        // TODO
        
        
        
    }    


    @FXML
    private void edit(ActionEvent event) {
         Name.setDisable(false);
        Surname.setDisable(false);
        Address.setDisable(false);
        card.setDisable(false);
        SN.setDisable(false);
        
        //to do
    }
    
}
