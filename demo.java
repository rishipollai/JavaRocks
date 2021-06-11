import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class demo {
    public static void main(String args[]) throws IOException {

        System.out.println("Welcome to student information system");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while(true){

            System.out.println("PRESS 1 TO ADD STUDENT");
            System.out.println("PRESS 2 TO DELETE STUDENT");
            System.out.println("PRESS 3 TO DISPLAY STUDENT");
            System.out.println("PRESS 4 TO EXIT");

            int c=Integer.parseInt(br.readLine());

            if(c==1){//add student operation
                System.out.println("Enter user name : ");
                String name=br.readLine();

                System.out.println("Enter user phone : ");
                String phone=br.readLine();

                System.out.println("Enter user city : ");
                String city=br.readLine();

                Student st=new Student(name,phone,city);
               boolean ans= StudentDao.insertStudentToDB(st);

               if(ans){
                   System.out.println("Student added successfully..");
               }
               else{
                   System.out.println("Something went wrong try again...");
               }
                System.out.println(st.getStudentName()+" "+st.getStudentCity());


            }
            else if(c==2){
                //delete
                System.out.println("Enter student id to delete:");
                int userId=Integer.parseInt(br.readLine());
                boolean dlt=StudentDao.deleteStudent(userId);
                if(dlt){
                    System.out.println("Record deleted successfully...");
                }
                else{
                    System.out.println("Something went wrong try again...");
                }


            }
            else if(c==3){//display all record
                StudentDao.showAllStudents();

            }
            else if(c==4){
                break;
            }
            else{

            }

            System.out.println("Thank You");
        }


    }
}
