/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.conf.Utils;
import com.mycompany.pojo.DocGia;
import com.mycompany.pojo.TheThuVien;
import com.mycompany.services.DocGiaService;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FXMLThemDocGiaController implements Initializable {
    @FXML private TextField txtMaDocGia;
    @FXML private TextField txtMaThe;
    @FXML private TextField txtHoDocGia;
    @FXML private TextField txtTenDocGia;
    @FXML private TextField txtGioiTinh;
    @FXML private TextField txtDoiTuong;
    @FXML private TextField txtBoPhan;
    @FXML private TextField txtEmail;
    @FXML private TextField txtDiaChi;
    @FXML private TextField txtSDT;
    @FXML private TextField txtGhiChu;
    @FXML private DatePicker txtNgaySinh;
    @FXML private DatePicker txtNgayBatDau;
    @FXML private DatePicker txtNgayHetHan;
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void themDocGiaHandler(ActionEvent event){

        Date ngaySinh = Date.valueOf(txtNgaySinh.getValue().toString());
        Date ngayBatDau = Date.valueOf(txtNgayBatDau.getValue().toString());
        Date ngayHetHan = Date.valueOf(txtNgayHetHan.getValue().toString());
        
        DocGia d = new DocGia(Integer.parseInt(this.txtMaDocGia.getText()), this.txtHoDocGia.getText(), 
                this.txtTenDocGia.getText(), this.txtGioiTinh.getText(), ngaySinh,
                this.txtDoiTuong.getText(), this.txtBoPhan.getText(), this.txtEmail.getText(),
                this.txtDiaChi.getText(), this.txtSDT.getText());
        
        TheThuVien t = new TheThuVien(Integer.parseInt(this.txtMaThe.getText()),
                ngayBatDau, ngayHetHan,
                Integer.parseInt(this.txtMaDocGia.getText()), this.txtGhiChu.getText());
        
        DocGiaService s = new DocGiaService();
        try {
            s.addDocGia(d, t);
            Utils.getBox("Thêm độc giả thất bại!", Alert.AlertType.WARNING).show();
        } catch (SQLException ex) {
            Utils.getBox("Thêm độc giả thành công!", Alert.AlertType.INFORMATION).show();
        }
    } 
}
