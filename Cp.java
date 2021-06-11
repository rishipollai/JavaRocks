import java.sql.*;
public class Cp {

    static Connection con;
    public static Connection createC()  {
       try {
           con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/demosql","root","9090");


       } catch (Exception e) {
           e.printStackTrace();
       }

       return  con;

    }
}
