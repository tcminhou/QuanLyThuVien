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
public class DocGia {
    private int maDocGia;
    private String hoDocGia;
    private String tenDocGia;
    private String gioiTinh;
    private Date ngaySinh;
    private String doiTuong;
    private String boPhan;
    private String email;
    private String diaChi;
    private String sDT;
    
    public DocGia (){
        
    }

    public DocGia(int maDocGia, String hoDocGia, String tenDocGia, String gioiTinh, Date ngaySinh,
            String doiTuong, String boPhan, String email, String diaChi, String sDT) {
        this.maDocGia = maDocGia;
        this.hoDocGia = hoDocGia;
        this.tenDocGia = tenDocGia;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.doiTuong = doiTuong;
        this.boPhan = boPhan;
        this.email = email;
        this.diaChi = diaChi;
        this.sDT = sDT;
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
     * @return the hoDocGia
     */
    public String getHoDocGia() {
        return hoDocGia;
    }

    /**
     * @param hoDocGia the hoDocGia to set
     */
    public void setHoDocGia(String hoDocGia) {
        this.hoDocGia = hoDocGia;
    }

    /**
     * @return the tenDocGia
     */
    public String getTenDocGia() {
        return tenDocGia;
    }

    /**
     * @param tenDocGia the tenDocGia to set
     */
    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the doiTuong
     */
    public String getDoiTuong() {
        return doiTuong;
    }

    /**
     * @param doiTuong the doiTuong to set
     */
    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    /**
     * @return the boPhan
     */
    public String getBoPhan() {
        return boPhan;
    }

    /**
     * @param boPhan the boPhan to set
     */
    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
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
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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
}
