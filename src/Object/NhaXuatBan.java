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
public class NhaXuatBan {
    private String manxb;
    private String tennxb;
    private String diachinxb;
    private String phone;
    private String email;

    public NhaXuatBan() {
    }

    public NhaXuatBan(String manxb, String tennxb, String diachinxb, String phone, String email) {
        this.manxb = manxb;
        this.tennxb = tennxb;
        this.diachinxb = diachinxb;
        this.phone = phone;
        this.email = email;
    }

    public String getManxb() {
        return manxb;
    }

    public void setManxb(String manxb) {
        this.manxb = manxb;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

    public String getDiachinxb() {
        return diachinxb;
    }

    public void setDiachinxb(String diachinxb) {
        this.diachinxb = diachinxb;
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
