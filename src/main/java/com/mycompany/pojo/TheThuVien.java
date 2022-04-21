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
public class TheThuVien {
    private int maThe;
    private Date ngayBatDau;
    private Date ngayHetHan;
    private int maDocGia;
    private String ghiChu;
    
    public TheThuVien(){
        
    }

    public TheThuVien(int maThe, Date ngayBatDau, Date ngayHetHan, int maDocGia, String ghiChu) {
        this.maThe = maThe;
        this.ngayBatDau = ngayBatDau;
        this.ngayHetHan = ngayHetHan;
        this.maDocGia = maDocGia;
        this.ghiChu = ghiChu;
    }
    
    public TheThuVien(Date ngayBatDau, Date ngayHetHan){
        this.ngayBatDau = ngayBatDau;
        this.ngayHetHan = ngayHetHan;
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
     * @return the ngayBatDau
     */
    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    /**
     * @param ngayBatDau the ngayBatDau to set
     */
    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    /**
     * @return the ngayHetHan
     */
    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    /**
     * @param ngayHetHan the ngayHetHan to set
     */
    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    /**
     * @return the maDocGia
     */
    public int getMaDocGia() {
        return maDocGia;
    }

    /**
     * @param maDocGia the maDocGia to set
     */
    public void setMaDocGia(int maDocGia) {
        this.maDocGia = maDocGia;
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
