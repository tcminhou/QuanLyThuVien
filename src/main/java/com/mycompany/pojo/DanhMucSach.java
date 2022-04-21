/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

/**
 *
 * @author PC
 */
public class DanhMucSach {
    private int maDanhMucSach;
    private String tenDanhMucSachString;
    private String ghiChu;
    
    public DanhMucSach(){
        
    }

    public DanhMucSach(int maDanhMucSach, String tenDanhMucSachString, String ghiChu) {
        this.maDanhMucSach = maDanhMucSach;
        this.tenDanhMucSachString = tenDanhMucSachString;
        this.ghiChu = ghiChu;
    }

    /**
     * @return the maDanhMucSach
     */
    public int getMaDanhMucSach() {
        return maDanhMucSach;
    }

    /**
     * @param maDanhMucSach the maDanhMucSach to set
     */
    public void setMaDanhMucSach(int maDanhMucSach) {
        this.maDanhMucSach = maDanhMucSach;
    }

    /**
     * @return the tenDanhMucSachString
     */
    public String getTenDanhMucSachString() {
        return tenDanhMucSachString;
    }

    /**
     * @param tenDanhMucSachString the tenDanhMucSachString to set
     */
    public void setTenDanhMucSachString(String tenDanhMucSachString) {
        this.tenDanhMucSachString = tenDanhMucSachString;
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
