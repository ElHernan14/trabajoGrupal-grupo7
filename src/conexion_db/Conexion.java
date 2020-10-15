package conexion_db;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
   private String base="universidad";
   private String url = "jdbc:mysql://localhost:3306/"+base;
   private String user = "root";
   private String pass = "";

 
   private Connection con;
    
    public Connection getConnection()
    {
        if(con==null)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection(url, user, pass);
            }
            catch (SQLException |ClassNotFoundException e)
            {
                System.err.print(e);
            }
        }
                return con;
    }
}

