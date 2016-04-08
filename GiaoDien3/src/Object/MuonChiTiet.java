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
public class MuonChiTiet {
    private String mapm;
    private String maserisach;

    public MuonChiTiet() {
    }

    public MuonChiTiet(String mapm, String maserisach) {
        this.mapm = mapm;
        this.maserisach = maserisach;
    }

    public String getMapm() {
        return mapm;
    }

    public void setMapm(String mapm) {
        this.mapm = mapm;
    }

    public String getMaserisach() {
        return maserisach;
    }

    public void setMaserisach(String maserisach) {
        this.maserisach = maserisach;
    }
    
}
