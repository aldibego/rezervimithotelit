/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import data.vdhoma;
import data.vprodukti;
import data.vrezervimi;
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
public class frezervimi {
    
   private lidhje mysql=new lidhje();
   private Connection cn=mysql.lidhe();
   private String sSQL="";
   public Integer totalregjister;
   
   
   public DefaultTableModel moster(String kerko){
       DefaultTableModel model;
       
       String [] titulli = {"ID","Iddhoma","Numri","Idklienti","Klienti","idpunonjes","Punonjes","Tipi Rezervimit","Data Rezervimit","Dat hyrje","Data dalje","Kostoja","Dhoma_e_zene"};
       
       String [] regjister =new String [13];
       
       totalregjister=0;
       model = new DefaultTableModel(null,titulli);
       
       sSQL="select r.idrezervimi,r.iddhoma,h.numri,r.idklienti,"+
               "(select emri from personi where idpersoni=r.idklienti)as klienti,"+
               "(select atesia from personi where idpersoni=r.idklienti)as klientiap,"+
               "r.idpunonjes,(select emri from personi where idpersoni=r.idpunonjes)as punonjes,"+
               "(select atesia from personi where idpersoni=r.idpunonjes)as punonjesap,"+
               "r.tipi_rezervimit,r.data_rezervimit,r.d"
               + "at_hyrje,r.dat_dalje,"+
               "r.kostoja_e_strehimit,r.dhoma_e_zene from rezervimi r inner join dhoma h on r.iddhoma=h.iddhoma where r.data_rezervimit like '%"+ kerko + "%' order by idrezervimi desc";
       
               
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               regjister [0]=rs.getString("idrezervimi");
               regjister [1]=rs.getString("iddhoma");
               regjister [2]=rs.getString("numri");
               regjister [3]=rs.getString("idklienti");
               regjister [4]=rs.getString("klienti") + " " + rs.getString("klientiap") ;
               regjister [5]=rs.getString("idpunonjes");
               regjister [6]=rs.getString("punonjes") + " " + rs.getString("punonjesap");
               regjister [7]=rs.getString("tipi_rezervimit");
               regjister [8]=rs.getString("data_rezervimit");
               regjister [9]=rs.getString("dat_hyrje");
               regjister [10]=rs.getString("dat_dalje");
               regjister [11]=rs.getString("kostoja_e_strehimit");
               regjister [12]=rs.getString("dhoma_e_zene");
               
               totalregjister=totalregjister+1;
               model.addRow(regjister);
               
           }
           return model;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean shto (vrezervimi dts){
       sSQL="insert into rezervimi (iddhoma,idklienti,idpunonjes,tipi_rezervimit,data_rezervimit,dat_hyrje,dat_dalje,kostoja_e_strehimit,dhoma_e_zene)" +
               "values (?,?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIddhoma());
           pst.setInt(2, dts.getIdklienti());
           pst.setInt(3, dts.getIdpunonjes());
           pst.setString(4, dts.getTipi_rezervimit());
           pst.setDate(5, dts.getData_rezervimit());
           pst.setDate(6, dts.getDat_hyrje());
           pst.setDate(7, dts.getDat_dalje());
           pst.setDouble(8, dts.getKostoja_e_strehimit());
           pst.setString(9, dts.getDhoma_e_zene());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
           
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean shkruaj (vrezervimi dts){
       sSQL="update rezervimi set iddhoma=?,idklienti=?,idpunonjes=?,tipi_rezervimit=?,data_rezervimit=?,dat_hyrje=?,dat_dalje=?,kostoja_e_strehimit=?,dhoma_e_zene=?"+
               " where idrezervimi=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
            
           pst.setInt(1, dts.getIddhoma());
           pst.setInt(2, dts.getIdklienti());
           pst.setInt(3, dts.getIdpunonjes());
           pst.setString(4, dts.getTipi_rezervimit());
           pst.setDate(5, dts.getData_rezervimit());
           pst.setDate(6, dts.getDat_hyrje());
           pst.setDate(7, dts.getDat_dalje());
           pst.setDouble(8, dts.getKostoja_e_strehimit());
           pst.setString(9, dts.getDhoma_e_zene());
           
           pst.setInt(10, dts.getIdrezervimi());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
     public boolean pagesa (vrezervimi dts){
       sSQL="update reservimi set dhoma_e_zene='Paguar'"+
               " where idrezervimi=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
             
           
           pst.setInt(1, dts.getIdrezervimi());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   
   
  
   public boolean elimino (vrezervimi dts){
       sSQL="delete from rezervimi where idrezervimi=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdrezervimi());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
    
    
    
    
    
}
