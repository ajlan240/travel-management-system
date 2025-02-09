import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    /*
    * 5 Steps in JDBC
    *   1 - Register the Driver
    *   2 - Creating Connection String
    *   3 - Creating the Statement
    *   4 - Executing MySQL queries
    *   5 -
    * */

    Connection con;
    Statement st;
    String url = "jdbc:mysql://localhost:3306/travelmanagement";
    String username = "root";
    String password = "920756";
    public Conn() {
        try {
            // Step : 1
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2
            con = DriverManager.getConnection(url, username, password);

            // Step 3
            st = con.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
