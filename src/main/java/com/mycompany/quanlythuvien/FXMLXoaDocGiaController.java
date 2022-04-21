/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.conf.Utils;
import com.mycompany.services.DocGiaService;
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
public class FXMLXoaDocGiaController implements Initializable {
    @FXML private TextField txtMaDocGia;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void xoaThongTinDocGiaHandler(ActionEvent event){
        DocGiaService d = new DocGiaService();
        try {
            d.xoaThongTinDocGia(Integer.parseInt(txtMaDocGia.getText()));
            Utils.getBox("Xóa độc giả thất bại!", Alert.AlertType.WARNING).show();
        } catch (SQLException ex) {
            Utils.getBox("Xóa độc giả thành công!", Alert.AlertType.INFORMATION).show();
        }
    }
}
