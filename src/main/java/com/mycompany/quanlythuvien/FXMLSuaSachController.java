/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.conf.Utils;
import com.mycompany.pojo.Sach;
import com.mycompany.services.SachService;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class FXMLSuaSachController implements Initializable {
    @FXML private TextField txtMaSach;
    @FXML private TextField txtTenSach;
    @FXML private TextField txtMaDMSach;
    @FXML private TextField txtMaNXB;
    @FXML private TextField txtMaTacGia;
    @FXML private TextField txtSoLuong;
    @FXML private TextField txtGhiChu;
    @FXML private DatePicker txtNamXB;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.txtMaSach.textProperty().addListener((evt) -> {   
            if (txtMaSach.getText().equals("")) {
                try {
                    this.loadSachData(1);
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLQuanLyDocGiaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    this.loadSachData(Integer.parseInt(txtMaSach.getText()));
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLQuanLyDocGiaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
    }    
    
    private void loadSachData (int id) throws SQLException{
        SachService s = new SachService();
        this.txtTenSach.setText(s.getSachId(id).getTenSach());
        this.txtMaDMSach.setText(String.valueOf(s.getSachId(id).getMaDMSach()));
        this.txtMaNXB.setText(String.valueOf(s.getSachId(id).getMaNXB()));
        this.txtMaTacGia.setText(String.valueOf(s.getSachId(id).getMaTacGia()));
        this.txtSoLuong.setText(String.valueOf(s.getSachId(id).getSoLuong()));
        this.txtGhiChu.setText(s.getSachId(id).getGhiChu());
        this.txtNamXB.setValue(LocalDate.parse(s.getSachId(id).getNamXB().toString()));               
        
    }
    
    public void suaThongTinSachHandler(ActionEvent event){
        Date namXB = Date.valueOf(txtNamXB.getValue().toString());
        
        Sach s = new Sach(Integer.parseInt(this.txtMaSach.getText()), this.txtTenSach.getText(),
                namXB, Integer.parseInt(this.txtMaDMSach.getText()), Integer.parseInt(this.txtMaNXB.getText()),
                Integer.parseInt(this.txtMaTacGia.getText()), Integer.parseInt(this.txtSoLuong.getText()),
                this.txtGhiChu.getText());                
        
        SachService sua = new SachService();
        try {
            sua.suaThongTinSach(s);
            Utils.getBox("Sửa thông tin sách thất bại!", Alert.AlertType.WARNING).show();
        } catch (SQLException ex) {
            Utils.getBox("Sửa thông tin sách thành công!", Alert.AlertType.INFORMATION).show();
        }
    }
}
