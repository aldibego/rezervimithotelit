/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import data.vklienti;
import data.vprodukti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geraldo
 */
public class fklienti {

    private lidhje mysql = new lidhje();
    private Connection cn = mysql.lidhe();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregjister;

    public DefaultTableModel moster(String kerko) {
        DefaultTableModel model;

        String[] titulli = {"ID", "Emri", "Atesia", "Mbiemri", "Dok", "Num Dokumentit", "Adresa", "Telefoni", "Email", "Kodi"};

        String[] regjister = new String[10];

        totalregjister = 0;
        model = new DefaultTableModel(null, titulli);

        sSQL = "select p.idpersoni,p.emri,p.atesia,p.mbiemri,p.tipi_dokumentit,p.num_dokumentit,"
                + "p.adresa,p.telefoni,p.email,kodi_klientit from personi p inner join klienti c "
                + "on p.idpersoni=p.idpersoni where num_dokumentit like '%"
                + kerko + "%' order by idpersoni desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                regjister[0] = rs.getString("idpersoni");
                regjister[1] = rs.getString("emri");
                regjister[2] = rs.getString("atesia");
                regjister[3] = rs.getString("mbiemri");
                regjister[4] = rs.getString("tipi_dokumentit");
                regjister[5] = rs.getString("num_dokumentit");
                regjister[6] = rs.getString("adresa");
                regjister[7] = rs.getString("telefoni");
                regjister[8] = rs.getString("email");
                regjister[9] = rs.getString("kodi_klientit");

                totalregjister = totalregjister + 1;
                model.addRow(regjister);

            }
            return model;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel mostervizit(String kerko) {
        DefaultTableModel model;

        String[] titulli = {"ID", "Emri", "Atesia", "Mbiemri", "Dok", "Num Dokumentit", "Adresa", "Telefoni", "Email", "Kodi"};

        String[] regjister = new String[10];

        totalregjister = 0;
        model = new DefaultTableModel(null, titulli);

        sSQL = "select p.idpersoni,p.emri,p.atesia,p.mbiemri,p.tipi_dokumentit,p.num_dokumentit,"
                + "p.adresa,p.telefoni,p.email,kodi_klientit from personi p inner join klienti c "
                + "on p.idpersoni=p.idpersoni where num_dokumentit like '%"
                + kerko + "%' order by idpersoni desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
              
                  regjister[0] = rs.getString("idpersoni");
                regjister[1] = rs.getString("emri");
                regjister[2] = rs.getString("atesia");
                regjister[3] = rs.getString("mbiemri");
                regjister[4] = rs.getString("tipi_dokumentit");
                regjister[5] = rs.getString("num_dokumentit");
                regjister[6] = rs.getString("adresa");
                regjister[7] = rs.getString("telefoni");
                regjister[8] = rs.getString("email");
                regjister[9] = rs.getString("kodi_klientit");
                
                totalregjister = totalregjister + 1;
                model.addRow(regjister);

            }
            return model;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    
    }
    public boolean shto(vklienti dts) {
        sSQL = "insert into personi (emri,atesia,mbiemri,tipi_dokumentit,num_dokumentit,adresa,telefoni,email)"
                + "values (?,?,?,?,?,?,?,?)";
        sSQL2 = "insert into klienti (idpersoni,kodi_klientit)"
                + "values ((select idpersoni from personi order by idpersoni desc limit 1),?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getEmri());
            pst.setString(2, dts.getAtesia());
            pst.setString(3, dts.getMbiemri());
            pst.setString(4, dts.getTipi_dokumentit());
            pst.setString(5, dts.getNum_dokumentit());
            pst.setString(6, dts.getAdresa());
            pst.setString(7, dts.getTelefoni());
            pst.setString(8, dts.getEmail());

            pst2.setString(1, dts.getKodi_klientit());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean shkruaj(vklienti dts) {
        sSQL = "update personi set emri=?,atesia=?,mbiemri=?,tipi_dokumentit=?,num_dokumentit=?,"
                + " adresa=?,telefoni=?,email=? where idpersoni=?";
        
        sSQL2 = "update klienti set kodi_klientit=?"
                + " where idpersoni=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getEmri());
            pst.setString(2, dts.getAtesia());
            pst.setString(3, dts.getMbiemri());
            pst.setString(4, dts.getTipi_dokumentit());
            pst.setString(5, dts.getNum_dokumentit());
            pst.setString(6, dts.getAdresa());
            pst.setString(7, dts.getTelefoni());
            pst.setString(8, dts.getEmail());
            pst.setInt(9, dts.getIdpersoni());

            pst2.setString(1, dts.getKodi_klientit());
            pst2.setInt(2, dts.getIdpersoni());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean elimino(vklienti dts) {
        sSQL = "delete from klienti where idpersoni=?";
        sSQL2 = "delete from personi where idpersoni=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            
            pst.setInt(1, dts.getIdpersoni());

            
            pst2.setInt(1, dts.getIdpersoni());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
