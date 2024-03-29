/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import data.vklienti;
import data.vprodukti;
import data.vpunonjes;
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
public class fpunonjes { 
    private lidhje mysql = new lidhje();
    private Connection cn = mysql.lidhe();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregjister;

    public DefaultTableModel moster(String kerko) {
        DefaultTableModel model;

        String[] titulli = {"ID", "Emri", "Atesia", "Mbiemri", "Dok", "Num Dokumentit", "Adresa", "Telefoni", "Email", "Paga","Akses","Login","Clave","Dhoma_e_zene"};

        String[] regjister = new String[14];

        totalregjister = 0;
        model = new DefaultTableModel(null, titulli);

        sSQL = "select p.idpersoni,p.emri,p.atesia,p.mbiemri,p.tipi_dokumentit,p.num_dokumentit,"
                + "p.adresa,p.telefoni,p.email,t.paga,t.akses,t.login,t.password,t.dhoma_e_zene from personi p inner join punonjes t "
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
                regjister[9] = rs.getString("paga");
                regjister[10] = rs.getString("akses");
                regjister[11] = rs.getString("login");
                regjister[12] = rs.getString("password");
                regjister[13] = rs.getString("dhoma_e_zene");
                
                totalregjister = totalregjister + 1;
                model.addRow(regjister);

            }
            return model;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean shto(vpunonjes dts) {
        sSQL = "insert into personi (emri,atesia,mbiemri,tipi_dokumentit,num_dokumentit,adresa,telefoni,email)"
                + "values (?,?,?,?,?,?,?,?)";
        sSQL2 = "insert into punonjes (idpersoni,paga,akses,login,password,dhoma_e_zene)"
                + "values ((select idpersoni from personi order by idpersoni desc limit 1),?,?,?,?,?)";
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

            pst2.setDouble(1, dts.getPaga());
            pst2.setString(2, dts.getAkses());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getDhoma_e_zene());
            
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

    public boolean shkruaj(vpunonjes dts) {
        sSQL = "update personi set emri=?,atesia=?,mbiemri=?,tipi_dokumentit=?,num_dokumentit=?,"
                + " adresa=?,telefoni=?,email=? where idpersoni=?";
        
        sSQL2 = "update punonjes set paga=?,akses=?,login=?,password=?,dhoma_e_zene=?"
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

            pst2.setDouble(1, dts.getPaga());
            pst2.setString(2, dts.getAkses());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getDhoma_e_zene());
            pst2.setInt(6, dts.getIdpersoni());

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

    public boolean elimino(vpunonjes dts) {
        sSQL = "delete from punonjes where idpersoni=?";
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
    
    
    public DefaultTableModel login(String login,String password) {
        DefaultTableModel model;

        String[] titulli = {"ID", "Emri", "Atesia", "Mbiemri","Akses","Login","Clave","Dhoma_e_zene"};

        String[] regjister = new String[8];

        totalregjister = 0;
        model = new DefaultTableModel(null, titulli);

        sSQL = "select p.idpersoni,p.emri,p.atesia,p.Mbiemri,"
                + "t.akses,t.login,t.password,t.dhoma_e_zene from personi p inner join punonjes t "
                + "on p.idpersoni=t.idpersoni where t.login='"
                + login + "' and t.password='" + password + "' and t.dhoma_e_zene='A'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                regjister[0] = rs.getString("idpersoni");
                regjister[1] = rs.getString("emri");
                regjister[2] = rs.getString("atesia");
                regjister[3] = rs.getString("mbiemri");
                
                regjister[4] = rs.getString("akses");
                regjister[5] = rs.getString("login");
                regjister[6] = rs.getString("password");
                regjister[7] = rs.getString("dhoma_e_zene");
                
                totalregjister = totalregjister + 1;
                model.addRow(regjister);

            }
            return model;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    
    
}
