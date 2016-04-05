/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author trung
 */
public class Admin {
    private String taikhoan;
    private String matkhau;
    private String name;

    public Admin(String taikhoan, String matkhau, String name) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.name = name;
    }

    public Admin() {
    }

    

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
