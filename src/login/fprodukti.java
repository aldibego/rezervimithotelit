/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import data.vdhoma;
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
public class fprodukti {
    
   private lidhje mysql=new lidhje();
   private Connection cn=mysql.lidhe();
   private String sSQL="";
   public Integer totalregjister;
   
   
   public DefaultTableModel moster(String kerko){
       DefaultTableModel model;
       
       String [] titulli = {"ID","Produkti","Pershkrim","Sasi","Ulje Cemimi"};
       
       String [] regjister =new String [5];
       
       totalregjister=0;
       model = new DefaultTableModel(null,titulli);
       
       sSQL="select * from produkti where emri like '%"+ kerko + "%' order by idprodukti desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               regjister [0]=rs.getString("idprodukti");
               regjister [1]=rs.getString("emri");
               regjister [2]=rs.getString("pershkrim");
               regjister [3]=rs.getString("sasi");
               regjister [4]=rs.getString("ulje_cemimi");
               
               
               totalregjister=totalregjister+1;
               model.addRow(regjister);
               
           }
           return model;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean shto (vprodukti dts){
       sSQL="insert into produkti (emri,pershkrim,sasi,ulje_cemimi)" +
               "values (?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getEmri());
           pst.setString(2, dts.getPershkrim());
           pst.setString(3, dts.getSasi());
           pst.setDouble(4, dts.getUlje_cemimi());
           
           
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
   
   public boolean shkruaj (vprodukti dts){
       sSQL="update produkti set emri=?,pershkrim=?,sasi=?,ulje_cemimi=?"+
               " where idprodukti=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getEmri());
           pst.setString(2, dts.getPershkrim());
           pst.setString(3, dts.getSasi());
           pst.setDouble(4, dts.getUlje_cemimi());
           
           pst.setInt(5, dts.getIdprodukti());
           
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
  
   public boolean elimino (vprodukti dts){
       sSQL="delete from produkti where idprodukti=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdprodukti());
           
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
