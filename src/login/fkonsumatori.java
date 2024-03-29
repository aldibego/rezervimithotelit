package login;


import data.vkonsumatori;
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
public class fkonsumatori {
     
   private lidhje mysql=new lidhje();
   private Connection cn=mysql.lidhe();
   private String sSQL="";
   public Integer totalregjister;
   public Double totalkonsumatori;
   
   
   public DefaultTableModel moster(String kerko){
       DefaultTableModel model;
       
       String [] titulli = {"ID","idrezervimi","idprodukti","produkti","kandidate","ulje_cemimi","dhoma_e_zene"};
       
       String [] regjister =new String [7];
       
       totalregjister=0;
       totalkonsumatori=0.0;
       model = new DefaultTableModel(null,titulli);
       
       sSQL="select c.idkonsumatori,c.idrezervimi,c.idprodukti,p.emri,c.kandidate,c.ulje_cemimi  "
               + ",c.dhoma_e_zene from konsumatori c inner join produkti p on c.idprodukti=p.idprodukti"
               + " where c.idrezervimi ="+ kerko + " order by c.idkonsumatori desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
              regjister [0]=rs.getString("idkonsumatori");
               regjister [1]=rs.getString("idrezervimi");
               regjister [2]=rs.getString("idprodukti");
               regjister [3]=rs.getString("emri");
               regjister [4]=rs.getString("kandidate");
               regjister [5]=rs.getString("ulje_cemimi");
                regjister [6]=rs.getString("dhoma_e_zene");
               
              totalregjister=totalregjister+1;
              totalkonsumatori=totalkonsumatori+(rs.getDouble("kandidate") * (rs.getDouble("ulje_cemimi")));
               model.addRow(regjister);
               
               
           }
           return model;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean shto (vkonsumatori dts){
      sSQL="insert into konsumatori (Idrezervimi,idprodukti,kandidate,ulje_cemimi,dhoma_e_zene)" +
               "values (?,?,?,?,?)";
       
       try {
            
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdprodukti());
           pst.setInt(2, dts.getIdrezervimi());
           pst.setDouble(3, dts.getKandidate());
           pst.setDouble(4, dts.getUlje_cemimi());
           pst.setString(5, dts.getDhoma_e_zene());
           
           
           
           
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
    public boolean shkruaj (vkonsumatori dts){
       sSQL="update produkti set idrezervimi=?,idprodukti=?,=kandidate?,ulje_cemimi=?,dhoma_e_zene=? "+
               " where idkonsumatori=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdprodukti());
           pst.setInt(2, dts.getIdrezervimi());
           pst.setDouble(3, dts.getKandidate());
           pst.setDouble(4, dts.getUlje_cemimi());
           pst.setString(5, dts.getDhoma_e_zene());
           
           pst.setInt(6 , dts.getIdkonsumatori());
          
  
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
  
   public boolean elimino (vkonsumatori dts){
       sSQL="delete from konsumatori where idkonsumatori=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdkonsumatori());
           
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
