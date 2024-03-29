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
public class vklienti extends vpersoni{
    private String kodi_klientit;

    public vklienti() {
    }

    public vklienti(String kodi_klientit) {
        this.kodi_klientit = kodi_klientit;
    }

    public String getKodi_klientit() {
        return kodi_klientit;
    }

    public void setKodi_klientit(String kodi_klientit) {
        this.kodi_klientit = kodi_klientit;
    }
    
}
