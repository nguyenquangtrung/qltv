/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuLieu;

import Object.NhaXuatBan;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class NhaXuatBanData {

    CallableStatement call = null;
    ResultSet rs=null;
    KetNoiSQL kn = new KetNoiSQL();
    //update nha xuat ban
    public boolean updatenxb(NhaXuatBan nxb) {
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call updatenxb1(?,?,?,?,?)}");
            call.setString(5, nxb.getManxb());
            call.setString(1, nxb.getTennxb());
            call.setString(2, nxb.getDiachinxb());
            call.setString(3, nxb.getPhone());
            call.setString(4, nxb.getEmail());
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //them nha xuat ban
    public boolean ThemNXB(NhaXuatBan nxb) {
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call themnxb(?,?,?,?,?)}");
            call.setString(1, nxb.getManxb());
            call.setString(2, nxb.getTennxb());
            call.setString(3, nxb.getDiachinxb());
            call.setString(4, nxb.getPhone());
            call.setString(5, nxb.getEmail());
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //xoa nha xua ban
    public boolean  XoaNXB(String ma){
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call xoanxb(?)}");
            call.setString(1, ma);
            result = call.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBanData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //hien thi thong tin nha xuat ban
    public ResultSet HienThi() {
        try {
            call=kn.getConnection().prepareCall("{call hienthinxb()}");
            rs=call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBanData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return rs;
    }
    public boolean KiemTraMaNXB(String ma){
        try {
            call=kn.getConnection().prepareCall("{call kiemtramanxb(?)}");
            call.setString(1, ma);
            rs=call.executeQuery();
            if(rs.next()){
                return  false;
            }
            else
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBanData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    public ResultSet TimKiemThongTin(String timiem){
        try {
            call = kn.getConnection().prepareCall("{call timkiemthongtinnxb(?)}");
            call.setString(1, timiem);
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBanData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    

}
