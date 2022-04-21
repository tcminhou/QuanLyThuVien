/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.services.CTPhieuMuonService;
import com.mycompany.services.DocGiaService;
import com.mycompany.services.SachService;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FXMLThongKeController implements Initializable {
    @FXML private Label lbSLDocGia;
    @FXML private Label lbSLDauSach;
    @FXML private Label lbSLDaMuon;
    @FXML private Label lbSLDaTra;
    @FXML private Label lbSLChuaTra;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.loadDemDocGia();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            // TODO
            this.loadDemDauSach();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.loadDemSachDaMuon();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.loadDemSachDaTra();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.loadDemSachChuaTra();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    public void loadDemDocGia() throws SQLException{
        DocGiaService d = new DocGiaService();
        this.lbSLDocGia.setText(String.valueOf(d.demDocgia()));
    }
    
    public void loadDemDauSach() throws SQLException{
        SachService s = new SachService();
        this.lbSLDauSach.setText(String.valueOf(s.demDauSach()));
    }  
    
    public void loadDemSachDaMuon() throws SQLException{
        CTPhieuMuonService c = new CTPhieuMuonService();
        if(c.demSachDaMuon() == 0)
            this.lbSLDaMuon.setText("0");
        else
            this.lbSLDaMuon.setText(String.valueOf(c.demSachDaMuon()));
    }  
    
    public void loadDemSachDaTra() throws SQLException{
        CTPhieuMuonService c = new CTPhieuMuonService();        
        if(c.demSachDaTra() == 0)
            this.lbSLDaTra.setText("0");
        else
            this.lbSLDaTra.setText(String.valueOf(c.demSachDaTra()));
    }  
    
    public void loadDemSachChuaTra() throws SQLException{
        CTPhieuMuonService c = new CTPhieuMuonService();        
        if(c.demSachChuaTra() == 0)
            this.lbSLChuaTra.setText("0");
        else
            this.lbSLChuaTra.setText(String.valueOf(c.demSachChuaTra()));
    }  
}
