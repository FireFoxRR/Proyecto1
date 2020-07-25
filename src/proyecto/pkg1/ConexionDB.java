
package proyecto.pkg1;

import java sql.Connection;
import java sql.Driver;
import java sql.Statement;

public class ConexionDB {
    
    private static ConexionDB con=null;
    public static ConexionDB getInstance(){
        if(con==null)
            con=new ConexionDB();
        return con;
    }
    
    
    private Connection conn= null;
    
    private ConexionDB(){
        
        String urlDatabase = 
    }
    
    
}
