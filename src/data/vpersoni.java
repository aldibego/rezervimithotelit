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
public class vpersoni {
    private int idpersoni;
    private String emri;
    private String atesia;
    private String mbiemri;
    private String tipi_dokumentit;
    private String num_dokumentit;
    private String adresa;
    private String telefoni;
    private String email;

    public vpersoni() {
    }

    public vpersoni(int idpersoni, String emri, String atesia, String mbiemri, String tipi_dokumentit, String num_dokumentit, String adresa, String telefoni, String email) {
        this.idpersoni = idpersoni;
        this.emri = emri;
        this.atesia = atesia;
        this.mbiemri = mbiemri;
        this.tipi_dokumentit = tipi_dokumentit;
        this.num_dokumentit = num_dokumentit;
        this.adresa = adresa;
        this.telefoni = telefoni;
        this.email = email;
    }

    public int getIdpersoni() {
        return idpersoni;
    }

    public void setIdpersoni(int idpersoni) {
        this.idpersoni = idpersoni;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getAtesia() {
        return atesia;
    }

    public void setAtesia(String atesia) {
        this.atesia = atesia;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getTipi_dokumentit() {
        return tipi_dokumentit;
    }

    public void setTipi_dokumentit(String tipi_dokumentit) {
        this.tipi_dokumentit = tipi_dokumentit;
    }

    public String getNum_dokumentit() {
        return num_dokumentit;
    }

    public void setNum_dokumentit(String num_dokumentit) {
        this.num_dokumentit = num_dokumentit;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefoni() {
        return telefoni;
    }

    public void setTelefoni(String telefoni) {
        this.telefoni = telefoni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
