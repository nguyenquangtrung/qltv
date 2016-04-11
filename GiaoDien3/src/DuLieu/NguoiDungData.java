/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuLieu;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class NguoiDungData {
    CallableStatement call=null;
    ResultSet rs=null;
    KetNoiSQL kn=new KetNoiSQL();
    public ResultSet HienThiSach() {
        try {
            call = kn.getConnection().prepareCall("{call hienthibangsach()}");
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    //tim kiem thong tin ve bang sach
    public ResultSet TimKiemThongTinBangSach(String timkiem){
        try {
            call=kn.getConnection().prepareCall("{call timkiemthongtinvesach(?)}");
            call.setString(1, timkiem);
            rs=call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
