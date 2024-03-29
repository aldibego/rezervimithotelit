
package data;

import java.sql.Date;

/**
 *
 * @author geraldo
 */
public class vpaga {
    private int idpaga;
    private int idrezervimi;
    private String tipi_kuponit;
    private String num_kuponit;
    private Double igv;
    private Double pagaa_totale;
    private Date dat_leshimi;
    private Date dat_pagese;

    public vpaga() {
    } 
    public vpaga(int idpaga, int idrezervimi, String tipi_kuponit, String num_kuponit, Double igv, Double pagesaa_totale, Date Dat_leshimi, Date dat_pagese) {
        this.idpaga = idpaga;
        this.idrezervimi = idrezervimi;
        this.tipi_kuponit = tipi_kuponit;
        this.num_kuponit = num_kuponit;
        this.igv = igv;
        this.pagaa_totale = pagaa_totale;
        this.dat_leshimi = dat_leshimi;
        this.dat_pagese = dat_pagese;
    }


    public int getIdpaga() {
        return idpaga;
    }

    public void setIdpaga(int idpaga) {
        this.idpaga = idpaga;
    }

    public int getIdrezervimi() {
        return idrezervimi;
    }

    public void setIdrezervimi(int idrezervimi) {
        this.idrezervimi = idrezervimi;
    }

    public String getTipi_kuponit() {
        return tipi_kuponit;
    }

    public void setTipi_kuponit(String tipi_kuponit) {
        this.tipi_kuponit = tipi_kuponit;
    }

    public String getNum_kuponit() {
        return num_kuponit;
    }

    public void setNum_kuponit(String num_kuponit) {
        this.num_kuponit = num_kuponit;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public Double getPagaa_totale() {
        return pagaa_totale;
    }

    public void setPagaa_totale(Double pagaa_totale) {
        this.pagaa_totale = pagaa_totale;
    }

    public Date getDat_leshimi() {
        return dat_leshimi;
    }

    public void setDat_leshimi(Date dat_leshimi) {
        this.dat_leshimi = dat_leshimi;
    }

    public Date getDat_pagese() {
        return dat_pagese;
    }

    public void setDat_pagese(Date dat_pagese) {
        this.dat_pagese = dat_pagese;
    }
}
