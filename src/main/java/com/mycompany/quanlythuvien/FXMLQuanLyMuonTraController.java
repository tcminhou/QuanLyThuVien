/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.conf.Utils;
import com.mycompany.pojo.CTPhieuMuon;
import com.mycompany.services.CTPhieuMuonService;
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
public class FXMLQuanLyMuonTraController implements Initializable {
    //txt Muon Sach
    @FXML private TextField txtIDM;
    @FXML private TextField txtMaPhieuMuonM;
    @FXML private TextField txtMaSachM;
    @FXML private DatePicker txtNgayTraM;
    @FXML private TextField txtTinhTrangM;
    @FXML private TextField txtGhiChuM;
    //txt Tra Sach
    @FXML private TextField txtIDT;
    @FXML private TextField txtMaPhieuMuonT;
    @FXML private TextField txtMaSachT;
    @FXML private DatePicker txtNgayTraT;
    @FXML private TextField txtTinhTrangT;
    @FXML private TextField txtGhiChuT;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {        
        // TODO
        this.txtIDT.textProperty().addListener((evt) -> {   
            if (txtIDT.getText().equals("")) {
                try {
                    this.loadCTPhieuMuonDataT(1);
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLQuanLyDocGiaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    this.loadCTPhieuMuonDataT(Integer.parseInt(txtIDT.getText()));
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLQuanLyDocGiaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
    }    
    
    public void muonSachHandler(ActionEvent event){
        Date ngayTra = Date.valueOf(txtNgayTraM.getValue().toString());
        CTPhieuMuon c = new CTPhieuMuon(Integer.parseInt(this.txtIDM.getText()),
                Integer.parseInt(this.txtMaPhieuMuonM.getText()),
                Integer.parseInt(this.txtMaSachM.getText()), ngayTra, this.txtTinhTrangM.getText(),
                this.txtGhiChuM.getText());
        
        CTPhieuMuonService t = new CTPhieuMuonService();
        try {
            t.muonSach(c);
            Utils.getBox("Mượn sách thất bại!", Alert.AlertType.WARNING).show();
        } catch (SQLException ex) {
            Utils.getBox("Mượn sách thành công!", Alert.AlertType.INFORMATION).show();
        }
    }
    
    public void traSachHandler(ActionEvent event){
        Date ngayTra = Date.valueOf(txtNgayTraT.getValue().toString());
        CTPhieuMuon c = new CTPhieuMuon(Integer.parseInt(this.txtIDT.getText()),
                Integer.parseInt(this.txtMaPhieuMuonT.getText()),
                Integer.parseInt(this.txtMaSachT.getText()), ngayTra, this.txtTinhTrangT.getText(),
                this.txtGhiChuT.getText());
        
        CTPhieuMuonService t = new CTPhieuMuonService();
        try {
            t.traSach(c);
            Utils.getBox("Trả sách thất bại!", Alert.AlertType.WARNING).show();
        } catch (SQLException ex) {
            Utils.getBox("Trả sách thành công!", Alert.AlertType.INFORMATION).show();
        }
    }
    
    //Load thong tin ben tab tra sach
    private void loadCTPhieuMuonDataT (int id) throws SQLException{
        CTPhieuMuonService d = new CTPhieuMuonService();
        this.txtMaPhieuMuonT.setText(String.valueOf(d.getCTPhieuMuonId(id).getMaPhieuMuon()));
        this.txtMaSachT.setText(String.valueOf(d.getCTPhieuMuonId(id).getMaSach()));
        this.txtNgayTraT.setValue(LocalDate.parse(d.getCTPhieuMuonId(id).getNgayTra().toString()));
        this.txtTinhTrangT.setText(d.getCTPhieuMuonId(id).getTinhTrang());
        this.txtGhiChuT.setText(d.getCTPhieuMuonId(id).getGhiChu());
        
    }
}
