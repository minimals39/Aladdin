/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aladdin.ui.login;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author japan
 */
public class LoginController implements Initializable {
    @FXML
    private Button loginbutton;
    @FXML
    private RadioButton buyer;
    @FXML
    private ToggleGroup type;
    @FXML
    private RadioButton seller;
    @FXML
    private ImageView logo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loginbutton.setDisable(true);
        Image image = new Image("/aladdin/seyana.PNG");
        logo.setImage(image);
    }    

    @FXML
    private void login(ActionEvent event) throws IOException {
<<<<<<< HEAD
<<<<<<< HEAD

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        try {
            if (buyer.isSelected()) {
                String user = Name.getText();
                String pass = Pass.getText();
                String sql = "SELECT * FROM aladdin.Customer WHERE ID= " + user;
                SQLQuery query = session.createSQLQuery(sql);
                query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                List data = query.list();
                System.out.println(pass);
                for (Object object : data) {
                    Map row = (Map) object;
                    System.out.print("First Name: " + row.get("Name"));
                    System.out.println(", Pass: " + row.get("Password"));

                    if (pass.equals(row.get("Password"))) {
                        System.out.println(", Correct " + row.get("Password"));
                        Stage primaryStage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/main/main.fxml"));
                        Scene scene = new Scene(root);
                        primaryStage.setTitle("Hello World!");
                        primaryStage.setScene(scene);
                        primaryStage.show();
                        closeStage();
                    }
                }

            } else if (seller.isSelected()) {

                String user = Name.getText();
                String pass = Pass.getText();
                String sql = "SELECT * FROM aladdin.Seller WHERE ID= " + user;
                SQLQuery query = session.createSQLQuery(sql);
                query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                List data = query.list();
                System.out.println(pass);
                for (Object object : data) {
                    Map row = (Map) object;
                    System.out.print("First Name: " + row.get("Name"));
                    System.out.println(", Pass: " + row.get("Password"));

                    if (pass.equals(row.get("Password"))) {
                        System.out.println(", Correct " + row.get("Password"));
                        Stage primaryStage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/sellermain/sellermain.fxml"));
                        Scene scene = new Scene(root);
                        primaryStage.setTitle("Hello World!");
                        primaryStage.setScene(scene);
                        primaryStage.show();
                        closeStage();
                    }
                }

            }
        } catch (Exception e) {
=======
=======
>>>>>>> parent of 569194d... Some Login edit
        try{
       if(buyer.isSelected()){     
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/main/main.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        closeStage();}
       else if(seller.isSelected()){
       Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/sellermain/sellermain.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        closeStage();
       
       }
        }
        
        catch(Exception e){
<<<<<<< HEAD
>>>>>>> parent of 569194d... Some Login edit
=======
>>>>>>> parent of 569194d... Some Login edit
            System.out.println("Cant load new window");
        }
    }
    
        private void closeStage() {
        ((Stage)loginbutton.getScene().getWindow()).close();
    }

    @FXML
    private void register(ActionEvent event) throws IOException{
        
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/aladdin/ui/register/register.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        closeStage();
    }

    @FXML
    private void tick(ActionEvent event) {
        loginbutton.setDisable(false);
    }
    
}
