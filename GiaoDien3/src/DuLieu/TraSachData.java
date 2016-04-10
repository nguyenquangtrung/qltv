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
public class TraSachData {
     //thuc hien cau sql tra sach
    CallableStatement call=null;
    ResultSet rs=null;
    KetNoiSQL kn=new KetNoiSQL();
    public ResultSet NhungNguoiMuonSach(){
        try {
            call = kn.getConnection().prepareCall("{call trasach1()}");
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(MuonData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    //tim nguoi muon sach
    public ResultSet TimNguoiMuonSach(String madg){
        try {
            call = kn.getConnection().prepareCall("{call timmuonsach2(?)}");
            call.setString(1, madg);
            rs = call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(TraSachData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    //update ngay tra sach
    public boolean UpdateTraSach(String maphieu,String ngaytra){
        int result=0;
        try {
            call=kn.getConnection().prepareCall("{call updatetrasach1(?)}");
            call.setString(1, maphieu);
           
            result=call.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TraSachData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result>0;
    }
}
