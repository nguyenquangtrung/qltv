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
public class ChiTietSAch {
   private String serisach;
   private String masach;
   private String tinhtrang;

    public ChiTietSAch() {
    }

    public ChiTietSAch(String serisach, String masach, String tinhtrang) {
        this.serisach = serisach;
        this.masach = masach;
        this.tinhtrang = tinhtrang;
    }

    public String getSerisach() {
        return serisach;
    }

    public void setSerisach(String serisach) {
        this.serisach = serisach;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
   
}
