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
public class DocGia {
    private String madg;
    private String matkhau;
    private String tendg;
    private String diachi;
    private String phone;
    private String email;

    public DocGia() {
    }

    public DocGia(String madg, String matkhau, String tendg, String diachi, String phone, String email) {
        this.madg = madg;
        this.matkhau = matkhau;
        this.tendg = tendg;
        this.diachi = diachi;
        this.phone = phone;
        this.email = email;
    }

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTendg() {
        return tendg;
    }

    public void setTendg(String tendg) {
        this.tendg = tendg;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 
    
}
