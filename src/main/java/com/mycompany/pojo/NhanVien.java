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
public class NhanVien {
    private int maNhanVien;
    private String hoNhanVien;
    private String tenNhanVien;
    private Date ngaySinh;
    private String sDT;

    public NhanVien(){
        
    }

    public NhanVien(int maNhanVien, String hoNhanVien, String tenNhanVien, Date ngaySinh, String sDT) {
        this.maNhanVien = maNhanVien;
        this.hoNhanVien = hoNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.sDT = sDT;
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
     * @return the hoNhanVien
     */
    public String getHoNhanVien() {
        return hoNhanVien;
    }

    /**
     * @param hoNhanVien the hoNhanVien to set
     */
    public void setHoNhanVien(String hoNhanVien) {
        this.hoNhanVien = hoNhanVien;
    }

    /**
     * @return the tenNhanVien
     */
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    /**
     * @param tenNhanVien the tenNhanVien to set
     */
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the sDT
     */
    public String getsDT() {
        return sDT;
    }

    /**
     * @param sDT the sDT to set
     */
    public void setsDT(String sDT) {
        this.sDT = sDT;
    }
    
}
