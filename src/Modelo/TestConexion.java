
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestConexion {
    
     public static void main(String[] args) {
       
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
       
        Conexion cn = new Conexion();       
        con = cn.getConnection();
        
        try {
                 String sql = "select * from usuarios where id = 2";
                 ps = con.prepareStatement(sql);
                 rs = ps.executeQuery();
                 rs.next();
                 String mail = rs.getString("correo");
                 String name = rs.getString("nombre");
                 String id = rs.getString("id");
                 Integer idnumero=Integer.parseInt(id);
                 
                 
                  System.out.println("correo Local:"+mail);
                  System.out.println("nombre Local:"+name);
                  System.out.println("id Local:"+id);
                  System.out.println("idnumero:"+idnumero);
                  
                 
        } catch (SQLException e) {
             System.out.println("Error en la conexion Local ");
            System.out.println(e);
        }
        
    }
    
}



