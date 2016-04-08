/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.sql.Date;

/**
 *
 * @author trung
 */
public class Muon {
    private String maphieumuon;
    private String madocgia;
    private String manhanvien;
    private Date ngaymuon;
    private Date ngayhen;

    public Muon(String maphieumuon, String madocgia, String manhanvien, Date ngaymuon, Date ngayhen) {
        this.maphieumuon = maphieumuon;
        this.madocgia = madocgia;
        this.manhanvien = manhanvien;
        this.ngaymuon = ngaymuon;
        this.ngayhen = ngayhen;
    }

    public Muon() {
    }

    public String getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(String maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public String getMadocgia() {
        return madocgia;
    }

    public void setMadocgia(String madocgia) {
        this.madocgia = madocgia;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public Date getNgayhen() {
        return ngayhen;
    }

    public void setNgayhen(Date ngayhen) {
        this.ngayhen = ngayhen;
    }
    
}
