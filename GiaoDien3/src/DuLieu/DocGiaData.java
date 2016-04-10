/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuLieu;

import Object.DocGia;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class DocGiaData {
    //them doc gia
    CallableStatement call=null;
    ResultSet rs=null;
    KetNoiSQL kn=new KetNoiSQL();
    public boolean ThemDG(DocGia dg){
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call themdocgia(?,?,?,?,?,?)}");
            call.setString(1, dg.getMadg());
            call.setString(2, dg.getMatkhau());
            call.setString(3, dg.getTendg());
            call.setString(4, dg.getDiachi());
            call.setString(5, dg.getPhone());
            call.setString(6, dg.getEmail());
            result = call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //hien thi toan bo doc gia
    public ResultSet HienThiDG(){
        try {
            call = kn.getConnection().prepareCall("{call hienthitoanbodg()}");
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    //ham update lai doc gia
    public boolean UpdateDG(DocGia dg){
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call updatedg(?,?,?,?,?,?)}");
            call.setString(1, dg.getMadg());
            call.setString(2, dg.getMatkhau());
            call.setString(3, dg.getTendg());
            call.setString(4, dg.getDiachi());
            call.setString(5, dg.getPhone());
            call.setString(6, dg.getEmail());
            result = call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //ham xoa doc gia
    public boolean XoaDG(String ma){
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call xoadg(?)}");
            call.setString(1, ma);
            result = call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //ham check ma cua doc gia
    public boolean checkmadg(String ma){
        try {
            call = kn.getConnection().prepareCall("{call checkmadg(?)}");
            call.setString(1, ma);
            rs = call.executeQuery();
            if (rs.next()) {
                return false;
            } else {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DocGiaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    //ham tim kiem thong tin cua doc gia
    public ResultSet timKiem(String timkiem){
        try {
            call = kn.getConnection().prepareCall("{call timkiemthongtin7(?)}");
            call.setString(1, timkiem);

            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    //ham thong tin dang nhap cua doc gia
    public DocGia dangnhap(String ma,String pass){
        DocGia dg = null;
        try {
            call = kn.getConnection().prepareCall("{call dangnhapdocgia(?,?)}");
            call.setString(1, ma);
            call.setString(2, pass);
            rs = call.executeQuery();
            while (rs.next()) {
                dg = new DocGia();
                dg.setTendg(rs.getString(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DocGiaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dg;
    }
    //kiem tra xoa doc gia
    public boolean ktxoadg(String ma){
        try {
            call=kn.getConnection().prepareCall("{call ktxoadg(?)}");
            call.setString(1, ma);
            rs=call.executeQuery();
            if(rs.next()){
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DocGiaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
