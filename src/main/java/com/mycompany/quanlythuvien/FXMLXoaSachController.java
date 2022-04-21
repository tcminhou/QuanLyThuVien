/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.conf.Utils;
import com.mycompany.services.SachService;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FXMLXoaSachController implements Initializable {
    @FXML private TextField txtMaSach;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void xoaThongTinSachHandler(ActionEvent event){
        SachService s = new SachService();
        try {
            s.xoaThongTinSach(Integer.parseInt(txtMaSach.getText()));
            Utils.getBox("Xóa sách thất bại!", Alert.AlertType.WARNING).show();
        } catch (SQLException ex) {
            Utils.getBox("Xóa sách thành công!", Alert.AlertType.INFORMATION).show();
        }
    }
}
