/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.conf.Utils;
import com.mycompany.pojo.DocGia;
import com.mycompany.pojo.Sach;
import com.mycompany.pojo.TheThuVien;
import com.mycompany.services.SachService;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FXMLThemSachController implements Initializable {
    @FXML private TextField txtMaSach;
    @FXML private TextField txtTenSach;
    @FXML private DatePicker txtNamXB;
    @FXML private TextField txtMaDMSach;
    @FXML private TextField txtMaNXB;
    @FXML private TextField txtMaTacGia;
    @FXML private TextField txtSoLuong;
    @FXML private TextField txtGhiChu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void themSachHandler(ActionEvent event){
        Date namXB = Date.valueOf(txtNamXB.getValue().toString());
        
        Sach d = new Sach(Integer.parseInt(this.txtMaSach.getText()), this.txtTenSach.getText(), 
                namXB, Integer.parseInt(this.txtMaDMSach.getText()), Integer.parseInt(this.txtMaNXB.getText()),
                Integer.parseInt(this.txtMaTacGia.getText()), Integer.parseInt(this.txtSoLuong.getText()),
                this.txtGhiChu.getText());

        
        SachService s = new SachService();
        try {
            s.addSach(d);
            Utils.getBox("Thêm sách thất bại!", Alert.AlertType.WARNING).show();
        } catch (SQLException ex) {
            Utils.getBox("Thêm sách thành công!", Alert.AlertType.INFORMATION).show();
        }
    } 
    
}
