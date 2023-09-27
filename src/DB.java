import java.sql.*;
public class DB {
      static Connection connect(){
            Connection conn = null;
            try{

                  //load the driver
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  
                  //create the connection
                  String url = "jdbc:mysql://localhost:3306/rekrek";
                  String user = "root";
                  String password = "rekildo3012";

                  conn = DriverManager.getConnection(url, user, password);

            }catch(Exception e){
                  System.out.println(e);
            }
            return conn;
      }
}
