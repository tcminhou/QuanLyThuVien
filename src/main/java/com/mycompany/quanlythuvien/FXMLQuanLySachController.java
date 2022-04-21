/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.pojo.Sach;
import com.mycompany.services.SachService;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FXMLQuanLySachController implements Initializable {
    @FXML private TableView<Sach> tbVSach;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.loadTableView();
        try {
            this.loadTableData(null);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLQuanLySachController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    private void loadTableView(){
        TableColumn colMaSach = new TableColumn("Mã Sách");
        colMaSach.setCellValueFactory(new PropertyValueFactory("MaSach"));
        colMaSach.setPrefWidth(90);
        
        TableColumn colTenSach = new TableColumn("Tên Sách");
        colTenSach.setCellValueFactory(new PropertyValueFactory("TenSach"));
        colTenSach.setPrefWidth(180);
        
        TableColumn colNamXB = new TableColumn("Năm Xuất Bản");
        colNamXB.setCellValueFactory(new PropertyValueFactory("NamXB"));
        colNamXB.setPrefWidth(140);
        
        TableColumn colMaDMSach = new TableColumn("Mã Danh Mục");
        colMaDMSach.setCellValueFactory(new PropertyValueFactory("MaDMSach"));
        colMaDMSach.setPrefWidth(130);
        
        TableColumn colMaNXB = new TableColumn("Mã NXB");
        colMaNXB.setCellValueFactory(new PropertyValueFactory("MaNXB"));
        colMaNXB.setPrefWidth(90);
        
        TableColumn colMaTacGia = new TableColumn("Mã Tác Giả");
        colMaTacGia.setCellValueFactory(new PropertyValueFactory("MaTacGia"));
        colMaTacGia.setPrefWidth(120);
        
        TableColumn colSoLuong = new TableColumn("Số Lượng");
        colSoLuong.setCellValueFactory(new PropertyValueFactory("SoLuong"));
        colSoLuong.setPrefWidth(90);
        
        TableColumn colGhiChu = new TableColumn("Ghi Chú");
        colGhiChu.setCellValueFactory(new PropertyValueFactory("GhiChu"));
        colGhiChu.setPrefWidth(150);
        
        this.tbVSach.getColumns().addAll(colMaSach, colTenSach, colNamXB, colMaDMSach,
                colMaNXB, colMaTacGia, colSoLuong, colGhiChu);
    }
    
    private void loadTableData (String kw) throws SQLException{
        SachService s = new SachService();
        this.tbVSach.setItems(FXCollections.observableArrayList(s.getSach(kw)));
    }
    
    public void themSachHandler(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXMLThemSach.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Thêm Sách");
        stage.show();
    }
    
    public void suaSachHandler(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXMLSuaSach.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Sửa Thông Tin Sách");
        stage.show();
    }
    
    public void xoaSachHandler(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXMLXoaSach.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Xóa Thông Tin Sách");
        stage.show();
    }
    
    public void lamMoiHandler(ActionEvent event){
        try {
            this.loadTableData(null);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLQuanLySachController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
