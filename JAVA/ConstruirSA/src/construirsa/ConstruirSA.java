
package construirsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConstruirSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            //1- Cargamos driver

            Class.forName("org.mariadb.jdbc.Driver");
            
            //2- Realizamos Conexion
            
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/construir sa","root","");
            
            //3- Insertar 3 empleados
            
//            String sql="INSERT INTO empleado(dni,apellido,nombre,acceso,estado)VALUES(45182335,'Campo','Pedro',3,1)";
//            String sq2="INSERT INTO empleado(dni,apellido,nombre,acceso,estado)VALUES(43121131,'Rocamora','Velentin',7,1)";
//            String sq3="INSERT INTO empleado(dni,apellido,nombre,acceso,estado)VALUES(45182336,'Portal','juan',4,1)";
//            
//          
//            PreparedStatement ps= conexion.prepareStatement(sql);
//            PreparedStatement ps2= conexion.prepareStatement(sq2);
//            PreparedStatement ps3= conexion.prepareStatement(sq3);
//            
//            ps2.executeUpdate();
//            ps3.executeUpdate();
            
            //4- Insertar 2 Herramientas
            
//            String sqlH="INSERT INTO herramienta(nombre,descripcion,stock,estado)VALUES('taladro','percutor',5,1),('Guantes','Anticorte',12,1)";
//            
//            PreparedStatement h=conexion.prepareStatement(sqlH);
//            
//            h.executeUpdate();

            //5- Listar herramientas con stock mayor a 10
            
//            String lista="SELECT * FROM herramienta WHERE stock>10";
//            
//            PreparedStatement her=conexion.prepareStatement(lista);           
//            ResultSet res=her.executeQuery();
//            
//            while(res.next()){
//                System.out.println("ID: "+ res.getInt("idHerramientas")+ " Nombre: "+res.getString("nombre")+" Descripcion: "+res.getString("descripcion")+" Stock: "+res.getInt("stock")+" Estado: "+res.getBoolean("estado"));
//            }
            
           //6- Dar de baja primer empleado
           
           String sql="UPDATE empleado SET estado=0,acceso=0 WHERE idEmpleado=1";
           
           PreparedStatement baja=conexion.prepareStatement(sql);
           baja.executeUpdate();
           
            
            
            
         
        } catch (ClassNotFoundException| SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar driver "+ex);
        
           
        }
    }
    
}
