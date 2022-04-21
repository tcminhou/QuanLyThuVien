/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.pojo.DocGia;
import com.mycompany.services.DocGiaService;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FXMLQuanLyDocGiaController implements Initializable {
    @FXML private TextField txtMaDocGia;
    @FXML private Label lbHoTen;
    @FXML private Label lbGioiTinh;
    @FXML private Label lbNgaySinh;
    @FXML private Label lbDoiTuong;
    @FXML private Label lbBoPhan;
    @FXML private Label lbHanThe;
    @FXML private Label lbEmail;
    @FXML private Label lbDiaChi;
    @FXML private Label lbSDT;

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
    
    public void themHandler(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXMLThemDocGia.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Thêm Độc Giả");
            stage.show();
    }
    
    public void suaHandler(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXMLSuaDocGia.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Sửa Thông Tin Độc Giả");
            stage.show();
    }
    
    public void xoaHandler(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXMLXoaDocGia.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Xóa Thông Tin Độc Giả");
            stage.show();
    }
    
    private void loadDocGiaData (int id) throws SQLException{
        DocGiaService d = new DocGiaService();
        this.lbHoTen.setText(d.getDocGiaId(id).getHoDocGia() + " " + d.getDocGiaId(id).getTenDocGia());
        this.lbGioiTinh.setText(d.getDocGiaId(id).getGioiTinh());
        this.lbNgaySinh.setText(d.getDocGiaId(id).getNgaySinh().toString());
        this.lbDoiTuong.setText(d.getDocGiaId(id).getDoiTuong());
        this.lbBoPhan.setText(d.getDocGiaId(id).getBoPhan());
        this.lbEmail.setText(d.getDocGiaId(id).getEmail());
        this.lbDiaChi.setText(d.getDocGiaId(id).getDiaChi());
        this.lbSDT.setText(d.getDocGiaId(id).getsDT());
        this.lbHanThe.setText(d.getDate(id).getNgayBatDau().toString()+ " --> " + d.getDate(id).getNgayHetHan().toString());
        
    }
    
    
}
