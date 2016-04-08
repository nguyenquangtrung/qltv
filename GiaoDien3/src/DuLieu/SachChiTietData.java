/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuLieu;

import Object.ChiTietSAch;
import Object.ChiTietSAch;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class SachChiTietData {
    CallableStatement call=null;
    ResultSet rs=null;
    KetNoiSQL kn=new KetNoiSQL();
    
    //them vao mot cuon sach chi tiet
    public boolean ThemSachChiTiet(ChiTietSAch cts){
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call themsachchitiet(?,?,?)}");
            call.setString(1, cts.getSerisach());
            call.setString(2, cts.getMasach());
            call.setString(3, cts.getTinhtrang());
            result = call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachChiTietData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //lay ra toan bo ma sach cua bang sach
    public ResultSet Layramasach(){
        try {
            call = kn.getConnection().prepareCall("{call layramasach()}");
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SachChiTietData.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rs;
    }
    //update cai bang sach chi tiet
    public boolean UpdateSachChiTiet(ChiTietSAch cts){
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call updatesachchitiet(?,?,?)}");
            call.setString(1, cts.getSerisach());
            call.setString(2, cts.getMasach());
            call.setString(3, cts.getTinhtrang());
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachChiTietData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //hien thi thong tin toan bo ve bang chi tiet sach
    public ResultSet ThongTinChiTietSach(){
        try {
            call = kn.getConnection().prepareCall("{call thongtinbangchitietsach()}");
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SachChiTietData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    // xoa 1 cuon sach chi tiet
    public boolean xoasachchitiet(String serisach){
        int result=0;
        try {
            call=kn.getConnection().prepareCall("{call xoa1cuonsachchitiet(?)}");
            call.setString(1, serisach);
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachChiTietData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result>0;
    }
    //update lai so luong cua bang khi xoa 1 cuon sach tu bang sach ci tiet
    public boolean updatesach(String masach){
      int result=0;
        try {
            call=kn.getConnection().prepareCall("{call updateslsbangchitiet(?)}");
            call.setString(1, masach);
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachChiTietData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result>0;
    }
    //kiem tra su trung ma cua bang Sach Chi Tiet
    public boolean checkseritrung(String ma){
        try {
            call=kn.getConnection().prepareCall("{call trungmachitietsach(?)}");
            call.setString(1, ma);
            rs=call.executeQuery();
            if(rs.next()){
                return  false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SachChiTietData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    //tim kiem thong tin cua bang Sach Chi Tiet
    public ResultSet TimkiemChiTiet(String timkiem){
        try {
            call = kn.getConnection().prepareCall("{call timkiemttbct(?)}");
            call.setString(1, timkiem);
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SachChiTietData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
