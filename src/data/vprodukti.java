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
public class vprodukti {
    
    
    private int idprodukti;
    private String emri;
    private String pershkrim;
    private String sasi;
    private Double ulje_cemimi;

    public vprodukti() {
    }

    public vprodukti(int idprodukti, String emri, String pershkrim, String sasi, Double ulje_cemimi) {
        this.idprodukti = idprodukti;
        this.emri = emri;
        this.pershkrim = pershkrim;
        this.sasi = sasi;
        this.ulje_cemimi = ulje_cemimi;
    }

    public int getIdprodukti() {
        return idprodukti;
    }

    public void setIdprodukti(int idprodukti) {
        this.idprodukti = idprodukti;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getPershkrim() {
        return pershkrim;
    }

    public void setPershkrim(String pershkrim) {
        this.pershkrim = pershkrim;
    }

    public String getSasi() {
        return sasi;
    }

    public void setSasi(String sasi) {
        this.sasi = sasi;
    }

    public Double getUlje_cemimi() {
        return ulje_cemimi;
    }

    public void setUlje_cemimi(Double ulje_cemimi) {
        this.ulje_cemimi = ulje_cemimi;
    } 
}
