package Config;

import java.sql.Connection;

public class Conexion {
    Connection con;
    public Conexion(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","12345678");
            
        }catch (Exception e){
            
            
        }
        
    }
    public Connection getConnection(){
        return con;
    }
}
