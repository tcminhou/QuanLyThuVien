/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class PhieuMuon {
    private int maPhieuMuon;
    private int maThe;
    private int maNhanVien;
    private Date ngayMuon;
    private String ghiChu;

    public PhieuMuon(){
        
    }

    public PhieuMuon(int maPhieuMuon, int maThe, int maNhanVien, Date ngayMuon, String ghiChu) {
        this.maPhieuMuon = maPhieuMuon;
        this.maThe = maThe;
        this.maNhanVien = maNhanVien;
        this.ngayMuon = ngayMuon;
        this.ghiChu = ghiChu;
    }
    
    
    /**
     * @return the maPhieuMuon
     */
    public int getMaPhieuMuon() {
        return maPhieuMuon;
    }

    /**
     * @param maPhieuMuon the maPhieuMuon to set
     */
    public void setMaPhieuMuon(int maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    /**
     * @return the maThe
     */
    public int getMaThe() {
        return maThe;
    }

    /**
     * @param maThe the maThe to set
     */
    public void setMaThe(int maThe) {
        this.maThe = maThe;
    }

    /**
     * @return the maNhanVien
     */
    public int getMaNhanVien() {
        return maNhanVien;
    }

    /**
     * @param maNhanVien the maNhanVien to set
     */
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    /**
     * @return the ngayMuon
     */
    public Date getNgayMuon() {
        return ngayMuon;
    }

    /**
     * @param ngayMuon the ngayMuon to set
     */
    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    /**
     * @return the ghiChu
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * @param ghiChu the ghiChu to set
     */
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
