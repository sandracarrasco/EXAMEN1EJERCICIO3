
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sady2
 */
public class conexion {
    Connection conexion=null;
    String pass="260299";
    String user="postgres";
    public void conectarme(){
        
        try{
            conexion = DriverManager.getConnection("",user,pass);
            JOptionPane.showMessageDialog(null,"GRABADO");
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
            
        }
    }
    
    public void Ingreso(String script){
        PreparedStatement p=null;
        conectarme();
        try{
            p=conexion.prepareStatement(script);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ejecucion compelto");
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
            
        }
        
        
        
    }
    
    
    
}
