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
public class Sach {
    private int maSach;
    private String tenSach;
    private Date namXB;
    private int maDMSach;
    private int maNXB;
    private int maTacGia;
    private int soLuong;
    private String ghiChu;

    public Sach(){
        
    }

    public Sach(int maSach, String tenSach, Date namXB, int maDMSach, int maNXB, int maTacGia, int soLuong, String ghiChu) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namXB = namXB;
        this.maDMSach = maDMSach;
        this.maNXB = maNXB;
        this.maTacGia = maTacGia;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
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
     * @return the tenSach
     */
    public String getTenSach() {
        return tenSach;
    }

    /**
     * @param tenSach the tenSach to set
     */
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    /**
     * @return the namXB
     */
    public Date getNamXB() {
        return namXB;
    }

    /**
     * @param namXB the namXB to set
     */
    public void setNamXB(Date namXB) {
        this.namXB = namXB;
    }

    /**
     * @return the maDMSach
     */
    public int getMaDMSach() {
        return maDMSach;
    }

    /**
     * @param maDMSach the maDMSach to set
     */
    public void setMaDMSach(int maDMSach) {
        this.maDMSach = maDMSach;
    }

    /**
     * @return the maNXB
     */
    public int getMaNXB() {
        return maNXB;
    }

    /**
     * @param maNXB the maNXB to set
     */
    public void setMaNXB(int maNXB) {
        this.maNXB = maNXB;
    }

    /**
     * @return the maTacGia
     */
    public int getMaTacGia() {
        return maTacGia;
    }

    /**
     * @param maTacGia the maTacGia to set
     */
    public void setMaTacGia(int maTacGia) {
        this.maTacGia = maTacGia;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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
