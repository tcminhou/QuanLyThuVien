/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.conf.JdbcUtils;
import com.mycompany.pojo.CTPhieuMuon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class CTPhieuMuonService {
    //Muon sach
    public void muonSach (CTPhieuMuon c) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement(
                    "INSERT INTO ct_phieumuon(id, MaPhieuMuon, MaSach, NgayTra, TinhTrang, GhiChu) VALUES (?, ?, ?, ?, ?, ?)");
            stm1.setInt(1, c.getId());
            stm1.setInt(2, c.getMaPhieuMuon());
            stm1.setInt(3, c.getMaSach());
            stm1.setDate(4, c.getNgayTra());
            stm1.setString(5, c.getTinhTrang());
            stm1.setString(6, c.getGhiChu());

            stm1.executeUpdate();
            conn.commit();
        }
    }
    
    //Tra sach
    public void traSach (CTPhieuMuon c) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement(
                    "UPDATE ct_phieumuon SET MaPhieuMuon=?, MaSach=?, NgayTra=?, TinhTrang=?, GhiChu=? WHERE id=?");
            stm1.setInt(6, c.getId());
            stm1.setInt(1, c.getMaPhieuMuon());
            stm1.setInt(2, c.getMaSach());
            stm1.setDate(3, c.getNgayTra());
            stm1.setString(4, c.getTinhTrang());
            stm1.setString(5, c.getGhiChu());

            stm1.executeUpdate();
            conn.commit();
        }
    }
    
    //Lay thong tin ct_phieumuon bang id
    public CTPhieuMuon getCTPhieuMuonId(int id) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            String sql = new String("SELECT * FROM ct_phieumuon WHERE id=?");            
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            CTPhieuMuon c = null;
            while (rs.next()) {                
                c = new CTPhieuMuon(rs.getInt("id"), rs.getInt("MaPhieuMuon"), rs.getInt("MaSach"),
                        rs.getDate("NgayTra"), rs.getString("TinhTrang"), rs.getString("GhiChu"));
            }  
            return c;
        }
    }
    
    //Dem sach da muon
    public int demSachDaMuon () throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement("SELECT * FROM ct_phieumuon WHERE TinhTrang=?");
            stm1.setString(1, "đã mượn");
            ResultSet rs = stm1.executeQuery();
            int d = 0;
            while (rs.next()) {                
                d++;
            }            
            return d;
        }        
    }
    
    //Dem sach da tra
    public int demSachDaTra () throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement("SELECT * FROM ct_phieumuon WHERE TinhTrang=?");
            stm1.setString(1, "đã trả");
            ResultSet rs = stm1.executeQuery();
            int d = 0;
            while (rs.next()) {                
                d++;
            }            
            return d;
            
        }        
    }   
    
    //Dem sach chua tra
    public int demSachChuaTra () throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
            PreparedStatement stm1 = conn.prepareStatement("SELECT * FROM ct_phieumuon WHERE TinhTrang=?");
            stm1.setString(1, "chưa trả");
            ResultSet rs = stm1.executeQuery();
            int d = 0;
            while (rs.next()) {                
                d++;
            }            
            return d;
        }        
    }  
}
