/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.register;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import org.apache.maven.Customer;
import org.apache.maven.Seller;
import org.hibernate.Session;
import org.apache.persistence.HibernateUtil;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class RegisterController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField pass;
    @FXML
    private PasswordField passcheck;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private RadioButton buyer;
    @FXML
    private ToggleGroup usertype;
    @FXML
    private RadioButton seller;
    @FXML
    private Button confirm;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        confirm.setDisable(true);
    }

    @FXML
    private void isBuyer(ActionEvent event) {
        confirm.setDisable(false);

    }

    @FXML
    private void isSeller(ActionEvent event) {
        confirm.setDisable(false);
    }

    @FXML
    private void confirm(ActionEvent event) throws IOException {
        String user = username.getText(); 
        String pw = pass.getText(); 
        String pwch = passcheck.getText(); 
        String n = name.getText(); 
        String sur = surname.getText(); 
        

        
        if (user.isEmpty()||pw.isEmpty()||pwch.isEmpty()||n.isEmpty()||sur.isEmpty()){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setContentText("Please input all field");
        alert.showAndWait();
        
        }
        if (seller.isSelected()) {
            System.out.println("Maven + Hibernate + MySQL");
            Session session = HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();
            Seller Account = new Seller();
            
            Account.setID(user);
            Account.setName(n);
            Account.setPassword(pw);
            Account.setPayment("None");
            Account.setSurname(sur);
            Account.setGoodsID("0");
            
            session.save(Account);
            session.getTransaction().commit();
            
            openmain("seller");
            closeStage();

        }
        else if (buyer.isSelected()){
            System.out.println("Maven + Hibernate + MySQL");
            Session session = HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();
            Customer Account = new Customer();

            Account.setID(user);
            Account.setName(n);
            Account.setSurname(sur);
            Account.setPassword(pw);
            Account.setPayment("None");
            Account.setAddress("None");     
            
            session.save(Account);
            session.getTransaction().commit();            
            openmain("buyer");
            closeStage();
        
        }
    }
    private void openmain(String type)throws IOException{
        String resource = "";
        if(type == "buyer"){
           resource = "/aladdin/ui/main/main.fxml";
        }
           else{
            resource = "/aladdin/ui/sellermain/sellermain.fxml";
        }
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource(resource));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
    }

    private void closeStage() {
        ((Stage) confirm.getScene().getWindow()).close();
    }

}