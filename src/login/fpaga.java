/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import data.vdhoma;
import data.vpaga;
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
public class fpaga {
    
   private lidhje mysql=new lidhje();
   private Connection cn=mysql.lidhe();
   private String sSQL="";
   public Integer totalregjister;
   
   
   public DefaultTableModel moster(String kerko){
       DefaultTableModel model;
       
       String [] titulli = {"ID","Idrezervimi","Tipi_kuponit","Num_kuponit","Igv","Pagaa_totale","Dat leshimi","Dat Pagese"};
       
       String [] regjister =new String [8];
       
       totalregjister=0;
       model = new DefaultTableModel(null,titulli);
       
       sSQL="select * from paga where idrezervimi="+ kerko + " order by idpaga desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               regjister [0]=rs.getString("idpaga");
               regjister [1]=rs.getString("idrezervimi");
               regjister [2]=rs.getString("tipi_kuponit");
               regjister [3]=rs.getString("num_kuponit");
               regjister [4]=rs.getString("igv");
               regjister [5]=rs.getString("pagaa_totale");
               regjister [6]=rs.getString("dat_leshimi");
               regjister [7]=rs.getString("dat_pagese");
               
               totalregjister=totalregjister+1;
               model.addRow(regjister);
               
           }
           return model;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean shto (vpaga dts){
       sSQL="insert into paga (idrezervimi,tipi_kuponit,num_kuponit,igv,pagaa_totale,dat_leshimi,dat_pagese)" +
               "values (?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdrezervimi());
           pst.setString(2, dts.getTipi_kuponit());
           pst.setString(3, dts.getNum_kuponit());
           pst.setDouble(4, dts.getIgv());
           pst.setDouble(5, dts.getPagaa_totale());
           pst.setDate(6, dts.getDat_leshimi());
           pst.setDate(7, dts.getDat_pagese());
           
           
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
   
   public boolean shkruaj (vpaga dts){
       sSQL="update paga set idrezervimi=?,tipi_kuponit=?,num_kuponit=?,igv=?,pagaa_totale=?,dat_leshimi=?,dat_pagese=?"+
               " where idpaga=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdrezervimi());
           pst.setString(2, dts.getTipi_kuponit());
           pst.setString(3, dts.getNum_kuponit());
           pst.setDouble(4, dts.getIgv());
           pst.setDouble(5, dts.getPagaa_totale());
           pst.setDate(6, dts.getDat_leshimi());
           pst.setDate(7, dts.getDat_pagese());
           
           pst.setInt(8, dts.getIdpaga());
           
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
  
   public boolean elimino (vpaga dts){
       sSQL="delete from paga where idpaga=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdpaga());
           
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
