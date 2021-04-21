import java.util.*;
class Student{
    int id;
    String name;
}

public class One{
    public static void main(String args[]){
       
       Student ob=new Student();
       ob.id=1;ob.name="RIshi";

       Student obb=new Student();

       obb.id=2;obb.name="Ram";

       System.out.println(ob.id+" "+ob.name);
       System.out.print(obb.id+" "+obb.name); 
    }
}




=================================================
Method Overloading

import java.util.*;
class Student{
    int add(int x,int y){
        return x+y;
    }
    int add(int x , int y ,int z){
        return x+y+z;
    }
}

public class One{
    public static void main(String args[]){
       
       Student ob=new Student();
      
       int result=ob.add(4,5);
       System.out.println(result);
       result=ob.add(4,4,4);
       System.out.println(result);

       
    //    System.out.print(obb.id+" "+obb.name); 
    }
}


===============

class One {

    int fact(int n)
    {
        if(n==0)
        {
             return 1;
        }
        else
        {
            return n*(fact(n-1));
           
        }
    }
    public static void main(String[] args) 
    {
        One ob=new One();
        System.out.println("Factorial of 4 is: "+ob.fact(4));
    }
}

=======================

