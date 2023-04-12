import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConnectionSinglton {
   public  static Connection myconnection = null ;
   private String url = "jdbc:mysql://localhost:3306/jdbc";
   private String username  = "root";
   private String password = "";

   private ConnectionSinglton() throws SQLException {
       myconnection =  DriverManager.getConnection(url , username, password) ;
   }
   public static Connection getconnection() throws  Exception{
       if(myconnection == null ){
           System.out.println("connection BDD");
           new ConnectionSinglton();
       }

       return myconnection ;

   }


}
