/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import data.vdhoma;
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
public class fdhoma {
     private lidhje mysql=new lidhje();
   private Connection cn=mysql.lidhe();
   private String sSQL="";
   public Integer totalregjister;
   
   
   public DefaultTableModel moster(String kerko){
       DefaultTableModel model;
       
       String [] titulli = {"ID","Numri","Personat","Pershkrimi","Karakteristika","Pagesa","Dhoma e zene","Tipi dhomave"};
       
       String [] regjister =new String [8];
       
       totalregjister=0;
       model = new DefaultTableModel(null,titulli);
       
       sSQL="select * from dhoma where Numri like '%"+ kerko + "%' order by iddhoma";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               regjister [0]=rs.getString("iddhoma");
               regjister [1]=rs.getString("numri");
               regjister [2]=rs.getString("personat");
               regjister [3]=rs.getString("pershkrimi");
               regjister [4]=rs.getString("karakteristika");
               regjister [5]=rs.getString("pagesa");
               regjister [6]=rs.getString("dhoma_e_zene");
               regjister [7]=rs.getString("tipi_dhomave");
               
               totalregjister=totalregjister+1;
               model.addRow(regjister);
               
           }
           return model;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } public DefaultTableModel mostervizit(String kerko){
       DefaultTableModel model;
       
       String [] titulli = {"ID","Numri","Personat","Pershkrimi","Karakteristika","Pagesa","Dhoma e zene","Tipi dhomave"};
       
       String [] regjister =new String [8];
       
       totalregjister=0;
       model = new DefaultTableModel(null,titulli);
       
       sSQL="select * from dhoma where Numri like '%"+ kerko + "%' and dhoma_e_zene='Disponibel' order by iddhoma";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               regjister [0]=rs.getString("iddhoma");
               regjister [1]=rs.getString("numri");
               regjister [2]=rs.getString("personat");
               regjister [3]=rs.getString("pershkrimi");
               regjister [4]=rs.getString("karakteristika");
               regjister [5]=rs.getString("pagesa");
               regjister [6]=rs.getString("dhoma_e_zene");
               regjister [7]=rs.getString("tipi_dhomave");
               
               totalregjister=totalregjister+1;
               model.addRow(regjister);
               
           }
           return model;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean shto (vdhoma dts){
       sSQL="insert into dhoma (numri,personat,pershkrimi,karakteristika,pagesa,dhoma_e_zene,tipi_dhomave)" +
               "values (?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNumri());
           pst.setString(2, dts.getPersonat());
           pst.setString(3, dts.getPershkrimi());
           pst.setString(4, dts.getKarakteristika());
           pst.setDouble(5, dts.getPagesa());
           pst.setString(6, dts.getDhoma_e_zene());
           pst.setString(7, dts.getTipi_dhomave());
           
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
   
   public boolean shkruaj (vdhoma dts){
       sSQL="update dhoma set numri=?,personat=?,pershkrimi=?,karakteristika=?,pagesa=?,dhoma_e_zene=?,tipi_dhomave=?"+
               " where iddhoma=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNumri());
           pst.setString(2, dts.getPersonat());
           pst.setString(3, dts.getPershkrimi());
           pst.setString(4, dts.getKarakteristika());
           pst.setDouble(5, dts.getPagesa());
           pst.setString(6, dts.getDhoma_e_zene());
           pst.setString(7, dts.getTipi_dhomave());
           pst.setInt(8, dts.getIddhoma());
           
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
   
    public boolean joezene (vdhoma dts){
       sSQL="update dhoma set dhoma_e_zene='Disponibel'"+
               " where iddhoma=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIddhoma());
           
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
   
   
  
   
     public boolean zene (vdhoma dts){
       sSQL="update dhoma set dhoma_e_zene='E zene'"+
               " where iddhoma=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIddhoma());
           
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
  
   
   
   
   
   public boolean elimino (vdhoma dts){
       sSQL="delete from dhoma where iddhoma=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIddhoma());
           
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

    public DefaultTableModel mostervizita(String kerko) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
   
   
  
   
}
