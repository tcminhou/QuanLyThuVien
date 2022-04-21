/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.quanlythuvien;

import com.mycompany.pojo.Sach;
import com.mycompany.services.SachService;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FXMLDocGiaController implements Initializable {
    @FXML private TextField txtKeyword;
    @FXML private TableView<Sach> tbSach;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.loadTableView();
        try {
            this.loadTableData(null);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocGiaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.txtKeyword.textProperty().addListener((evt) -> {        
            try {
                this.loadTableData(txtKeyword.getText());
            } catch (SQLException ex) {
                Logger.getLogger(FXMLDocGiaController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
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
        
        this.tbSach.getColumns().addAll(colMaSach, colTenSach, colNamXB, colMaDMSach,
                colMaNXB, colMaTacGia, colSoLuong, colGhiChu);
    }
    
    private void loadTableData (String kw) throws SQLException{
        SachService s = new SachService();
        this.tbSach.setItems(FXCollections.observableArrayList(s.getSach(kw)));
    }
}
