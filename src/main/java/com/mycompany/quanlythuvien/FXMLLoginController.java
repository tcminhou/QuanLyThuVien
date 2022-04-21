/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.conf.Utils;
import com.mycompany.services.UserService;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.security.auth.login.LoginContext;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FXMLLoginController implements Initializable {
    @FXML private TextField txtUserName;
    @FXML private PasswordField txtPassword;
    @FXML private Button lblogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    public void loginHandler(ActionEvent event) throws SQLException, IOException{
        if(UserService.login(txtUserName.getText().toString(), txtPassword.getText().toString())){
            Utils.getBox("Đăng nhập thành công!", Alert.AlertType.INFORMATION).show();
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXMLFunction.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Quản Lý Thư Viện");
            stage.show();
        }
        else
            Utils.getBox("Đăng nhập không thành công!", Alert.AlertType.WARNING).show();
        
        
    }
    
}
