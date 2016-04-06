/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuLieu;

import Object.Admin;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class DangNhapAdmin {
    ResultSet rs=null;
    CallableStatement call=null;
    KetNoiSQL kn=new  KetNoiSQL();
    
  public Admin  laythongtin(String taikhoan ,String matkhau ){
          Admin ad=null;
        try {
            call =kn.getConnection().prepareCall("{call dangnhapadmin(?,?)}");
            call.setString(1, taikhoan);
            call.setString(2, matkhau);
            rs=call.executeQuery();
            while(rs.next()){
              ad=new Admin();
              ad.setName(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangNhapAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
 
      return ad;
  }
        
}
