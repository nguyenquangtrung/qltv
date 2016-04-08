/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuLieu;

import Object.Muon;
import Object.MuonChiTiet;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author trung
 */
public class MuonData {
    CallableStatement call=null;
    ResultSet rs=null;
    KetNoiSQL kn=new KetNoiSQL();
    //them mot cai phieu muon
    public boolean ThemPhieuMuon(Muon m){
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call themmotphieumuon(?,?,?,?,?)}");
            call.setString(1, m.getMaphieumuon());
            call.setString(2, m.getMadocgia());
            call.setString(3, m.getManhanvien());
            call.setDate(4, m.getNgaymuon());
            call.setDate(5, m.getNgayhen());
            result = call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MuonData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
   //kiem tra su trung ma cua bang muon
    public boolean KiemTraMaMuon(String maphieu){
        try {
            call = kn.getConnection().prepareCall("{call krmaphieumuon(?)}");
            call.setString(1, maphieu);
            rs = call.executeQuery();
            if (rs.next()) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MuonData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    //hirn thi toan  bo bang muon
    public ResultSet HienThiMuon(){
        try {
            call = kn.getConnection().prepareCall("{call ToanBoBangMuon()}");
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(MuonData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    //chinh sua cai bang muon
    public boolean ChinhSuaBangMuon(Muon m){
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call chinhsuabangmuon(?,?,?,?,?)}");
            call.setString(1, m.getMaphieumuon());
            call.setString(2, m.getMadocgia());
            call.setString(3, m.getManhanvien());
            call.setDate(4, m.getNgaymuon());
            call.setDate(5, m.getNgayhen());
            result = call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MuonData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //xoa 1 phieu muon 
    public boolean XoaPhieuMuon(String mapm){
        int result = 0;
        try {
            call = kn.getConnection().prepareCall("{call xoaphieuuon1(?)}");
            call.setString(1, mapm);
            result = call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MuonData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result > 0;
    }
    //them mot phieu muon chi Tiet
    public boolean ThemPhieuMuonChiTiet(MuonChiTiet mct){
        int result=0;
        try {
            call=kn.getConnection().prepareCall("{call themmophieumuonchitiet(?,?,?)}");
            call.setString(1, mct.getMapm());
            call.setString(2, mct.getMaserisach());
            call.setString(3, null);
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MuonData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result>0;
    }
    //showra toan bo thong tin bang muon ci tiet
    public ResultSet TTMuonCT(){
        try {
            call = kn.getConnection().prepareCall("{call showmuonctie()}");
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(MuonData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
   
   
}
