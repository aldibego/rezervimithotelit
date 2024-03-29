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
public class vdhoma {
     private int iddhoma;
    private String numri;
    private String personat;
    private String pershkrimi;
    private String karakteristika;
    private Double pagesa;
    private String dhoma_e_zene;
    private String tipi_dhomave;

    public vdhoma(int iddhoma, String numri, String personat, String pershkrimi, String karakteristika, Double pagesa, String dhoma_e_zene, String tipi_dhomave) {
        this.iddhoma = iddhoma;
        this.numri = numri;
        this.personat = personat;
        this.pershkrimi = pershkrimi;
        this.karakteristika = karakteristika;
        this.pagesa = pagesa;
        this.dhoma_e_zene = dhoma_e_zene;
        this.tipi_dhomave = tipi_dhomave;
    }

    public vdhoma() {
    }

    public int getIddhoma() {
        return iddhoma;
    }

    public void setIddhoma(int iddhoma) {
        this.iddhoma = iddhoma;
    }

    public String getNumri() {
        return numri;
    }

    public void setNumri(String numri) {
        this.numri = numri;
    }

    public String getPersonat() {
        return personat;
    }

    public void setPersonat(String personat) {
        this.personat = personat;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    public String getKarakteristika() {
        return karakteristika;
    }

    public void setKarakteristika(String karakteristika) {
        this.karakteristika = karakteristika;
    }

    public Double getPagesa() {
        return pagesa;
    }

    public void setPagesa(Double pagesa) {
        this.pagesa = pagesa;
    }

    public String getDhoma_e_zene() {
        return dhoma_e_zene;
    }

    public void setDhoma_e_zene(String dhoma_e_zene) {
        this.dhoma_e_zene = dhoma_e_zene;
    }

    public String getTipi_dhomave() {
        return tipi_dhomave;
    }

    public void setTipi_dhomave(String tipi_dhomave) {
        this.tipi_dhomave = tipi_dhomave;
    }
    
}
