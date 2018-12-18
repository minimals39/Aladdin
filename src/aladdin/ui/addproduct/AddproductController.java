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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

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
    private TextField Prize;
    @FXML
    private TextArea Info;
    @FXML
    private Button Submit;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void uploadimg(ActionEvent event) throws IOException{ 
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files",
                        "*.bmp", "*.png", "*.jpg", "*.gif"));
        if(selectedFile != null){
            String imagepath = selectedFile.toURI().toURL().toString();
            Image image = new Image(imagepath);
            imgv1.setImage(image);
        }
        else{
            System.out.println("bad");
        }
    }
    
}
