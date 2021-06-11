import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean insertStudentToDB(Student st){
      boolean f=false;
      try{
          //jdbc code
          Connection con=Cp.createC();
          String q="insert into studentdetails(sname,phone,scity) values(?,?,?)";

          //PreparedStatement
         PreparedStatement pstm = con.prepareStatement(q);

         //set the value of parameter
          pstm.setString(1,st.getStudentName());
          pstm.setString(2,st.getStudentPhone());
          pstm.setString(3,st.getStudentCity());

          //execute
          pstm.executeUpdate();
          f=true;


      } catch (Exception e) {
          e.printStackTrace();
      }
      return f;


    }

    public static boolean deleteStudent(int userId) {

        boolean f=false;
        try{
            //jdbc code
            Connection con=Cp.createC();
            String q="delete from studentdetails where sid=?";

            //PreparedStatement
            PreparedStatement pstm = con.prepareStatement(q);

            //set the value of parameter
            pstm.setInt(1,userId);

            //execute
            pstm.executeUpdate();
            f=true;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;

    }

    public static void showAllStudents() {


        try{
            //jdbc code
            Connection con=Cp.createC();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from studentdetails");
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String phone=rs.getString(3);
                String city=rs.getString(4);

                System.out.println(id+" "+name+" "+phone+" "+city);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
