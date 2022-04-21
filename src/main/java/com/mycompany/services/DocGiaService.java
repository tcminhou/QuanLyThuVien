/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.conf.JdbcUtils;
import com.mycompany.pojo.DocGia;
import com.mycompany.pojo.TheThuVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author PC
 */
public class DocGiaService {
    // Lay thong tin doc gia bang id
    public DocGia getDocGiaId(int id) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            String sql = new String("SELECT * FROM docgia WHERE MaDocGia=?");            
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            DocGia d = null;
            while (rs.next()) {                
                d = new DocGia(rs.getInt("MaDocGia"), rs.getString("HoDocGia"),
                        rs.getString("TenDocGia"), rs.getString("GioiTinh"), rs.getDate("NgaySinh"),
                        rs.getString("DoiTuong"), rs.getString("BoPhan"), rs.getString("Email"),
                        rs.getString("DiaChi"), rs.getString("SDT"));
            }
                
            return d;
        }
        
    }
    
    //Lay ngay cua the thu vien
    public TheThuVien getDate(int id) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            String sql = new String("SELECT * FROM thethuvien WHERE MaDocGia=?");            
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            TheThuVien t = null;
            while (rs.next()) {                
                t = new TheThuVien(rs.getDate("NgayBatDau"), rs.getDate("NgayHetHan"));
            }
                
            return t;
        }
    }
    
    // Them doc gia
    public void addDocGia (DocGia d, TheThuVien t) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement(
                    "INSERT INTO docgia(MaDocGia, HoDocGia, TenDocGia, GioiTinh, NgaySinh, DoiTuong, BoPhan, Email, DiaChi, SDT) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stm1.setInt(1, d.getMaDocGia());
            stm1.setString(2, d.getHoDocGia());
            stm1.setString(3, d.getTenDocGia());
            stm1.setString(4, d.getGioiTinh());
            stm1.setDate(5, d.getNgaySinh());
            stm1.setString(6, d.getDoiTuong());
            stm1.setString(7, d.getBoPhan());
            stm1.setString(8, d.getEmail());
            stm1.setString(9, d.getDiaChi());
            stm1.setString(10, d.getsDT());

            stm1.executeUpdate();
            
            PreparedStatement stm2 = conn.prepareStatement("INSERT INTO thethuvien(MaThe, NgayBatDau, NgayHetHan, MaDocGia, GhiChu) VALUES (?, ?, ?, ?, ?)");
            stm2.setInt(1, t.getMaThe());
            stm2.setDate(2, t.getNgayBatDau());
            stm2.setDate(3, t.getNgayHetHan());
            stm2.setInt(4, t.getMaDocGia());
            stm2.setString(5, t.getGhiChu());

            stm2.executeUpdate();
            conn.commit();
        }
    }

    //Sua thong tin doc gia
    public void suaThongTinDocGia (DocGia d, TheThuVien t) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement(
                    "UPDATE docgia SET HoDocGia=?, TenDocGia=?, GioiTinh=?, NgaySinh=?, DoiTuong=?, BoPhan=?, Email=?, DiaChi=?, SDT=? WHERE MaDocGia=?");
            stm1.setInt(10, d.getMaDocGia());
            stm1.setString(1, d.getHoDocGia());
            stm1.setString(2, d.getTenDocGia());
            stm1.setString(3, d.getGioiTinh());
            stm1.setDate(4, d.getNgaySinh());
            stm1.setString(5, d.getDoiTuong());
            stm1.setString(6, d.getBoPhan());
            stm1.setString(7, d.getEmail());
            stm1.setString(8, d.getDiaChi());
            stm1.setString(9, d.getsDT());

            stm1.executeUpdate();
            
            PreparedStatement stm2 = conn.prepareStatement("UPDATE thethuvien SET NgayBatDau=?, NgayHetHan=? WHERE MaDocGia=?");
            stm2.setDate(1, t.getNgayBatDau());
            stm2.setDate(2, t.getNgayHetHan());
            stm2.setInt(3, t.getMaDocGia());
            stm2.executeUpdate();
            conn.commit();
        }
    }
    
    //Xoa thong tin doc gia
    public void xoaThongTinDocGia (int id) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement(
                    "DELETE FROM docgia WHERE (MaDocGia=?)");
            stm1.setInt(1, id);
            stm1.executeUpdate();
            
            PreparedStatement stm2 = conn.prepareStatement("DELETE FROM thethuvien WHERE (MaDocGia=?)");
            stm2.setInt(1, id);
            stm2.executeUpdate();
            conn.commit();
        }
    }
    
    //Dem so luong doc gia
    public int demDocgia () throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM docgia");
            int d = 0;
            while (rs.next()) {                
                d++;
            }            
            return d;
        }        
    }
}
