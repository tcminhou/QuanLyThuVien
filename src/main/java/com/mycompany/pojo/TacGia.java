/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

/**
 *
 * @author PC
 */
public class TacGia {
    private int maTacGia;
    private String hoTacGia;
    private String tenTacGia;
    private int namSinh;

    public TacGia(){
        
    }

    public TacGia(int maTacGia, String hoTacGia, String tenTacGia, int namSinh) {
        this.maTacGia = maTacGia;
        this.hoTacGia = hoTacGia;
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
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
     * @return the hoTacGia
     */
    public String getHoTacGia() {
        return hoTacGia;
    }

    /**
     * @param hoTacGia the hoTacGia to set
     */
    public void setHoTacGia(String hoTacGia) {
        this.hoTacGia = hoTacGia;
    }

    /**
     * @return the tenTacGia
     */
    public String getTenTacGia() {
        return tenTacGia;
    }

    /**
     * @param tenTacGia the tenTacGia to set
     */
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    /**
     * @return the namSinh
     */
    public int getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}
