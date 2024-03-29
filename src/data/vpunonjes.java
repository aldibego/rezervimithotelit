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
public class vpunonjes extends vpersoni{
    Double paga;
     String akses;
     String login;
     String password;
     String dhoma_e_zene;

    public vpunonjes() {
    }

    public vpunonjes(Double paga, String akses, String login, String password, String dhoma_e_zene) {
        this.paga = paga;
        this.akses = akses;
        this.login = login;
        this.password = password;
        this.dhoma_e_zene = dhoma_e_zene;
    }

    public Double getPaga() {
        return paga;
    }

    public void setPaga(Double paga) {
        this.paga = paga;
    }

    public String getAkses() {
        return akses;
    }

    public void setAkses(String akses) {
        this.akses = akses;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDhoma_e_zene() {
        return dhoma_e_zene;
    }

    public void setDhoma_e_zene(String dhoma_e_zene) {
        this.dhoma_e_zene = dhoma_e_zene;
    }

 
    
}
