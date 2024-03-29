/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author geraldo
 */
public class vkonsumatori {
    private int idkonsumatori;
    private int idrezervimi;
    private int idprodukti;
    private Double kandidate;
    private Double ulje_cemimi;
    private String dhoma_e_zene;

    public vkonsumatori() {
    }

    public vkonsumatori(int idkonsumatori, int idrezervimi, int idprodukti, Double kandidate, Double ulje_cemimi, String dhoma_e_zene) {
        this.idkonsumatori = idkonsumatori;
        this.idrezervimi = idrezervimi;
        this.idprodukti = idprodukti;
        this.kandidate = kandidate;
        this.ulje_cemimi = ulje_cemimi;
        this.dhoma_e_zene = dhoma_e_zene;
    }

    public int getIdkonsumatori() {
        return idkonsumatori;
    }

    public void setIdkonsumatori(int idkonsumatori) {
        this.idkonsumatori = idkonsumatori;
    }

    public int getIdrezervimi() {
        return idrezervimi;
    }

    public void setIdrezervimi(int idrezervimi) {
        this.idrezervimi = idrezervimi;
    }

    public int getIdprodukti() {
        return idprodukti;
    }

    public void setIdprodukti(int idprodukti) {
        this.idprodukti = idprodukti;
    }

    public Double getKandidate() {
        return kandidate;
    }

    public void setKandidate(Double kandidate) {
        this.kandidate = kandidate;
    }

    public Double getUlje_cemimi() {
        return ulje_cemimi;
    }

    public void setUlje_cemimi(Double ulje_cemimi) {
        this.ulje_cemimi = ulje_cemimi;
    }

    public String getDhoma_e_zene() {
        return dhoma_e_zene;
    }

    public void setDhoma_e_zene(String dhoma_e_zene) {
        this.dhoma_e_zene = dhoma_e_zene;
    }
    
}
