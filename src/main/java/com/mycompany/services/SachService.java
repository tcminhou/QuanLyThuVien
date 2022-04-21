/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.conf.JdbcUtils;
import com.mycompany.pojo.Sach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class SachService {
    //Lay danh sach sach theo tu khoa
    public List<Sach> getSach(String kw) throws SQLException{
        List<Sach> sach = new ArrayList<>();
        try(Connection conn = JdbcUtils.getConn()){
            String sql = new String("SELECT * FROM sach");
            if (kw != null && !kw.isEmpty()) 
                sql += " WHERE TenSach like concat('%', ?, '%')";
            
            PreparedStatement stm = conn.prepareStatement(sql);
            if (kw != null && !kw.isEmpty()) 
                stm.setString(1, kw);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Sach c = new Sach(rs.getInt("MaSach"), rs.getString("TenSach"), rs.getDate("NamXB"),
                    rs.getInt("MaDMSach"), rs.getInt("MaNXB"), rs.getInt("MaTacGia"),
                rs.getInt("SoLuong"), rs.getString("GhiChu"));
                sach.add(c);
            }               
            
        }
        return sach;
    }
    
    //Lay sach theo ID
    public Sach getSachId(int id) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            String sql = new String("SELECT * FROM sach WHERE MaSach=?");            
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            Sach s = null;
            while (rs.next()) {                
                s = new Sach(rs.getInt("MaSach"), rs.getString("TenSach"), rs.getDate("NamXB"),
                    rs.getInt("MaDMSach"), rs.getInt("MaNXB"), rs.getInt("MaTacGia"),
                rs.getInt("SoLuong"), rs.getString("GhiChu"));
            }
                
            return s;
        }
    }
    
    //Them sach
    public void addSach (Sach s) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement(
                    "INSERT INTO sach(MaSach, TenSach, NamXB, MaDMSach, MaNXB, MaTacGia, SoLuong, GhiChu) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            stm1.setInt(1, s.getMaSach());
            stm1.setString(2, s.getTenSach());
            stm1.setDate(3, s.getNamXB());
            stm1.setInt(4, s.getMaDMSach());
            stm1.setInt(5, s.getMaNXB());
            stm1.setInt(6, s.getMaTacGia());
            stm1.setInt(7, s.getSoLuong());
            stm1.setString(8, s.getGhiChu());

            stm1.executeUpdate();
            conn.commit();
        }
    }
    
    // Sua thong tin sach
    public void suaThongTinSach (Sach s) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement(
                    "UPDATE sach SET TenSach=?, NamXB=?, MaDMSach=?, MaNXB=?, MaTacGia=?, SoLuong=?, GhiChu=? WHERE MaSach=?");
            stm1.setInt(8, s.getMaSach());
            stm1.setString(1, s.getTenSach());
            stm1.setDate(2, s.getNamXB());
            stm1.setInt(3, s.getMaDMSach());
            stm1.setInt(4, s.getMaNXB());
            stm1.setInt(5, s.getMaTacGia());
            stm1.setInt(6, s.getMaDMSach());
            stm1.setString(7, s.getGhiChu());

            stm1.executeUpdate();
            conn.commit();
        }
    }
    
    // Xoa thong tin sach bang ID
    public void xoaThongTinSach (int id) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement("DELETE FROM sach WHERE (MaSach=?)");
            stm1.setInt(1, id);
            stm1.executeUpdate();
            
            conn.commit();
        }
    }
    
    //Đếm đầu sách
    public int demDauSach () throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM sach");
            int d = 0;
            while (rs.next()) {                
                d++;
            }            
            return d;
        }        
    }
}
