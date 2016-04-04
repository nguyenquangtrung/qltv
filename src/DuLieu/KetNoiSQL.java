/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuLieu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class KetNoiSQL {
    public Connection getConnection() throws SQLException{
        Connection con=null;
        try {
            //
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sa="sa";
            String pass="123456";
            String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=ThuVien";
            con=DriverManager.getConnection(url, sa, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    public static void main(String[] args) {
        KetNoiSQL kn=new KetNoiSQL();
        try {
            Connection con=   kn.getConnection();
            System.out.println(con);
        } catch (SQLException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}
