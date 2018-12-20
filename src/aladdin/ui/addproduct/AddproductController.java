/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.addproduct;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import org.apache.maven.Customer;
import org.apache.persistence.HibernateUtil;
import org.hibernate.Session;
import org.apache.maven.Goods;
import aladdin.SellerData;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class AddproductController implements Initializable {

    @FXML
    private Button img;
    @FXML
    private ImageView imgv1;
    @FXML
    private TextField PdName;
    @FXML
    private TextField Price;
    @FXML
    private TextArea PdInfo;
    @FXML
    private Button Submit;
    @FXML
    private RadioButton sports;
    @FXML
    private ToggleGroup category;
    @FXML
    private RadioButton computer;
    @FXML
    private RadioButton Kids;
    @FXML
    private RadioButton Clothes;
    @FXML
    private RadioButton Tools;
    @FXML
    private RadioButton Other;
    @FXML
   // private TextField amount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void uploadimg(ActionEvent event) throws IOException {
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files",
                        "*.bmp", "*.png", "*.jpg", "*.gif"));
        if (selectedFile != null) {
            String imagepath = selectedFile.toURI().toURL().toString();
            Image image = new Image(imagepath);
            imgv1.setImage(image);
        } else {
            System.out.println("bad");
        }
    }

    @FXML
    private void Submit(ActionEvent event) {
        System.out.println("We're here");
        
        String info = PdInfo.getText();
        String name = PdName.getText();
        String price = Price.getText();
        String quantiy = "Null";
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Goods goods = new Goods();

        goods.setDetail(info);
        goods.setName(name);
        goods.setPrice(price);
        goods.setQuantity(quantiy);
        
        
        SellerData sellerdata = SellerData.getinstance();
        
        
        System.out.println(sellerdata.getName());
        String newString = '\''+ sellerdata.getName() + '\'';
        /*String sql = "SELECT * FROM aladdin.Seller WHERE Name= "+ newString;
        SQLQuery query = session.createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List data = query.list();
        for (Object object : data) {
            Map row = (Map) object;
            goods.setSeller(""+row.get("ID"));
        }*/
        goods.setSeller(sellerdata.getName());
        

        session.save(goods);
        session.getTransaction().commit();
        System.out.println("Added");
        
        
        
    }

}
