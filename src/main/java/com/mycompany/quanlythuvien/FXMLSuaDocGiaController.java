/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.conf.Utils;
import com.mycompany.pojo.DocGia;
import com.mycompany.pojo.TheThuVien;
import com.mycompany.services.DocGiaService;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FXMLSuaDocGiaController implements Initializable {
    @FXML private TextField txtMaDocGia;
    @FXML private TextField txtHoDocGia;
    @FXML private TextField txtTenDocGia;
    @FXML private TextField txtGioiTinh;
    @FXML private DatePicker txtNgaySinh;
    @FXML private TextField txtDoiTuong;
    @FXML private TextField txtBoPhan;
    @FXML private DatePicker txtNgayBatDau;
    @FXML private DatePicker txtNgayHetHan;
    @FXML private TextField txtEmail;
    @FXML private TextField txtDiaChi;
    @FXML private TextField txtSDT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.txtMaDocGia.textProperty().addListener((evt) -> {   
            if (txtMaDocGia.getText().equals("")) {
                try {
                    this.loadDocGiaData(1);
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLQuanLyDocGiaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    this.loadDocGiaData(Integer.parseInt(txtMaDocGia.getText()));
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLQuanLyDocGiaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
    }    
    
    private void loadDocGiaData (int id) throws SQLException{
        DocGiaService d = new DocGiaService();
        this.txtHoDocGia.setText(d.getDocGiaId(id).getHoDocGia());
        this.txtTenDocGia.setText(d.getDocGiaId(id).getTenDocGia());
        this.txtGioiTinh.setText(d.getDocGiaId(id).getGioiTinh());
        this.txtNgaySinh.setValue(LocalDate.parse(d.getDocGiaId(id).getNgaySinh().toString()));
        this.txtDoiTuong.setText(d.getDocGiaId(id).getDoiTuong());
        this.txtBoPhan.setText(d.getDocGiaId(id).getBoPhan());
        this.txtEmail.setText(d.getDocGiaId(id).getEmail());
        this.txtDiaChi.setText(d.getDocGiaId(id).getDiaChi());
        this.txtSDT.setText(d.getDocGiaId(id).getsDT());
        this.txtNgayBatDau.setValue(LocalDate.parse(d.getDate(id).getNgayBatDau().toString()));
        this.txtNgayHetHan.setValue(LocalDate.parse(d.getDate(id).getNgayHetHan().toString()));                
        
    }
    
    public void suaThongTinHandler(ActionEvent event) throws SQLException{
        Date ngaySinh = Date.valueOf(txtNgaySinh.getValue().toString());
        Date ngayBatDau = Date.valueOf(txtNgayBatDau.getValue().toString());
        Date ngayHetHan = Date.valueOf(txtNgayHetHan.getValue().toString());
        
        DocGia d = new DocGia(Integer.parseInt(this.txtMaDocGia.getText()), this.txtHoDocGia.getText(), 
                this.txtTenDocGia.getText(), this.txtGioiTinh.getText(), ngaySinh,
                this.txtDoiTuong.getText(), this.txtBoPhan.getText(), this.txtEmail.getText(),
                this.txtDiaChi.getText(), this.txtSDT.getText());
        
        TheThuVien t = new TheThuVien(ngayBatDau, ngayHetHan);
                
        
        DocGiaService s = new DocGiaService();
        try {
            s.suaThongTinDocGia(d, t);
            Utils.getBox("Sửa thông tin độc giả thất bại!", Alert.AlertType.WARNING).show();
        } catch (SQLException ex) {
            Utils.getBox("Sửa thông tin độc giả thành công!", Alert.AlertType.INFORMATION).show();
        }
    }
}
