/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuLieu;

import Object.Sach;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class SachData {
    CallableStatement call=null;
    ResultSet rs=null;
    KetNoiSQL kn=new KetNoiSQL();
    //lay ra cai ma cua nha xuat ban tu ten
    public ResultSet LayMaNXB(String tennxb){
        try {
            call = kn.getConnection().prepareCall("{call laymanxb(?)}");
            call.setString(1, tennxb);
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SachData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    //lay toan bo ten nha xuat ban
    public ResultSet LayToanBoTenCuaNhaXuatBan(){
        try {
            call = kn.getConnection().prepareCall("{call laytennxb()}");
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SachData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    //them mot lo sach
    public boolean ThemLoSach(Sach s){
        int result =0;
        try {
            call=kn.getConnection().prepareCall("{call themlosach(?,?,?,?,?,?,?)}");
            call.setString(1, s.getMasach());
            call.setString(2, s.getTensach());
            call.setString(3, s.getTacgia());
            call.setString(4, s.getManxb());
            call.setString(5, s.getTheloai());
            call.setFloat(6, s.getGia());
            call.setInt(7, s.getSoluong());
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result>0;
    }
    //update 1 lo sach
     public boolean UpdateLoSach(Sach s){
        int result =0;
        try {
            call=kn.getConnection().prepareCall("{call updatelosach(?,?,?,?,?,?,?)}");
            call.setString(1, s.getMasach());
            call.setString(2, s.getTensach());
            call.setString(3, s.getTacgia());
            call.setString(4, s.getManxb());
            call.setString(5, s.getTheloai());
            call.setFloat(6, s.getGia());
            call.setInt(7, s.getSoluong());
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result>0;
    }
     //xoa 1 lo sach
     public boolean XoaLoSach(String ma){
       int result=0;
        try {
            call=kn.getConnection().prepareCall("{call xoalosach(?)}");
            call.setString(1, ma);
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  result>0;
     }
     //lay thong tin ve bang sach
     public ResultSet ThongTinSach(){
        try {
            call=kn.getConnection().prepareCall("{call toantaptt()}");
            rs=call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SachData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
     }
     //dung de kiem tra trung ma sach
     public boolean KiemTRaMaSAch(String ma){
        try {
            call=kn.getConnection().prepareCall("{call kiemtramatrung(?)}");
            call.setString(1, ma);
            rs=call.executeQuery();
            if(rs.next()){
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SachData.class.getName()).log(Level.SEVERE, null, ex);
        }
         return true;
     }
}
