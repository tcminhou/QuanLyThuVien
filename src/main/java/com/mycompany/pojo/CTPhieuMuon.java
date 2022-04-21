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
public class CTPhieuMuon {
    private int id;
    private int maPhieuMuon;
    private int maSach;
    private Date ngayTra;
    private String tinhTrang;
    private String ghiChu;

    public CTPhieuMuon(){
        
    }

    public CTPhieuMuon(int id, int maPhieuMuon, int maSach, Date ngayTra, String tinhTrang, String ghiChu) {
        this.id = id;
        this.maPhieuMuon = maPhieuMuon;
        this.maSach = maSach;
        this.ngayTra = ngayTra;
        this.tinhTrang = tinhTrang;
        this.ghiChu = ghiChu;
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the maSach
     */
    public int getMaSach() {
        return maSach;
    }

    /**
     * @param maSach the maSach to set
     */
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    /**
     * @return the ngayTra
     */
    public Date getNgayTra() {
        return ngayTra;
    }

    /**
     * @param ngayTra the ngayTra to set
     */
    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    /**
     * @return the tinhTrang
     */
    public String getTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
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
