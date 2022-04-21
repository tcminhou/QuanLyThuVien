/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

/**
 *
 * @author PC
 */
public class NhaXuatBan {
    private int maNXB;
    private String tenNXB;
    private String diaChiVPDD;
    private String email;
    private String nguoiDaiDien;
    private String sDT;
    
    public NhaXuatBan(){
        
    }

    public NhaXuatBan(int maNXB, String tenNXB, String diaChiVPDD, String email, String nguoiDaiDien, String sDT) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
        this.diaChiVPDD = diaChiVPDD;
        this.email = email;
        this.nguoiDaiDien = nguoiDaiDien;
        this.sDT = sDT;
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
     * @return the tenNXB
     */
    public String getTenNXB() {
        return tenNXB;
    }

    /**
     * @param tenNXB the tenNXB to set
     */
    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    /**
     * @return the diaChiVPDD
     */
    public String getDiaChiVPDD() {
        return diaChiVPDD;
    }

    /**
     * @param diaChiVPDD the diaChiVPDD to set
     */
    public void setDiaChiVPDD(String diaChiVPDD) {
        this.diaChiVPDD = diaChiVPDD;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nguoiDaiDien
     */
    public String getNguoiDaiDien() {
        return nguoiDaiDien;
    }

    /**
     * @param nguoiDaiDien the nguoiDaiDien to set
     */
    public void setNguoiDaiDien(String nguoiDaiDien) {
        this.nguoiDaiDien = nguoiDaiDien;
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
