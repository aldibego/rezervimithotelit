
package data;
/**
 *
 * @author geraldo
 */
import java.sql.Date;

public class vrezervimi {
    private int idrezervimi;
    private int iddhoma;
    private int idklienti;
    private int idpunonjes;
    private String tipi_rezervimit;
    private Date data_rezervimit;
    private Date dat_hyrje;
    private Date dat_dalje;
    private Double kostoja_e_strehimit;
    private String dhoma_e_zene;

    public vrezervimi() {
    }

    public vrezervimi(int idrezervimi, int iddhoma, int idklienti, int idpunonjes, String tipi_rezervimit, Date data_rezervimit, Date dat_hyrje, Date dat_dalje, Double kostoja__e_strehimit, String dhoma_e_zene) {
        this.idrezervimi = idrezervimi;
        this.iddhoma = iddhoma;
        this.idklienti = idklienti;
        this.idpunonjes = idpunonjes;
        this.tipi_rezervimit = tipi_rezervimit;
        this.data_rezervimit = data_rezervimit;
        this.dat_hyrje = dat_hyrje;
        this.dat_dalje = dat_dalje;
       this.kostoja_e_strehimit = kostoja_e_strehimit;
        this.dhoma_e_zene = dhoma_e_zene;
    }

    public int getIdrezervimi() {
        return idrezervimi;
    }

    public void setIdrezervimi(int idrezervimi) {
        this.idrezervimi = idrezervimi;
    }

    public int getIddhoma() {
        return iddhoma;
    }

    public void setIddhoma(int iddhoma) {
        this.iddhoma = iddhoma;
    }

    public int getIdklienti() {
        return idklienti;
    }

    public void setIdklienti(int idklienti) {
        this.idklienti = idklienti;
    }

    public int getIdpunonjes() {
        return idpunonjes;
    }

    public void setIdpunonjes(int idpunonjes) {
        this.idpunonjes = idpunonjes;
    }

    public String getTipi_rezervimit() {
        return tipi_rezervimit;
    }

    public void setTipi_rezervimit(String tipi_rezervimit) {
        this.tipi_rezervimit = tipi_rezervimit;
    }

    public Date getData_rezervimit() {
        return data_rezervimit;
    }

    public void setData_rezervimit(Date data_rezervimit) {
        this.data_rezervimit = data_rezervimit;
    }

    public Date getDat_hyrje() {
        return dat_hyrje;
    }

    public void setDat_hyrje(Date dat_hyrje) {
        this.dat_hyrje = dat_hyrje;
    }

    public Date getDat_dalje() {
        return dat_dalje;
    }

    public void setDat_dalje(Date dat_dalje) {
        this.dat_dalje = dat_dalje;
    }

    public Double getKostoja_e_strehimit() {
        return kostoja_e_strehimit;
    }

    public void setKostoja_e_strehimit(Double kostoja_e_strehimit) {
        this.kostoja_e_strehimit = kostoja_e_strehimit;
    }

    public String getDhoma_e_zene() {
        return dhoma_e_zene;
    }

    public void setDhoma_e_zene(String dhoma_e_zene) {
        this.dhoma_e_zene = dhoma_e_zene;
    }

}
   