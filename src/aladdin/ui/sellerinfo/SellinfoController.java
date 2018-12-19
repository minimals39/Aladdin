/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.sellerinfo;

import aladdin.SellerData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.apache.persistence.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class SellinfoController implements Initializable {

    @FXML
    private Button editbutton;
    @FXML
    private Label inName;
    @FXML
    private Label InSurname;
    @FXML
    private Label InInfo;
    @FXML
    private Label InPayment;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        System.out.println("Can We get here 1");

        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Can We get here 2");
        session.beginTransaction();
        System.out.println("Can We get here 3");
        
        SellerData sellerdata = SellerData.getinstance();
        System.out.println(sellerdata.getName());
        String sql = "SELECT * FROM aladdin.Seller WHERE ID= 'TestSeller'";
        System.out.println("4");

        SQLQuery query = session.createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List data = query.list();
        for (Object object : data) {
            Map row = (Map) object;
            /*inName.setText(""+row.get("Name"));
            InSurname.setText(""+row.get("Surname"));*/
            inName.setText(sellerdata.getName());
            InSurname.setText(sellerdata.getSurname());
            InInfo.setText(sellerdata.getGoodsID());
            InPayment.setText(sellerdata.getPayment());
        }

    }

    @FXML
    private void edit(ActionEvent event) {
    }

}
