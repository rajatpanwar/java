import java.io.*;
import java.util.*;
class Number
{
   public static void main(String[] args)
     {
        String name;
         int age;
       System.out.println("Enter the name:-- " );
        System.out.println("enter the age:--");
         Scanner sc=new Scanner(System.in);
          name=sc.nextLine();
          age=sc.nextInt();
       try
         {
            if(!name.matches("[a-zA-Z]+"))      // if name mismatch between  these character throw the exception
               {
                  throw 
                        new Exception();
                }
                if(age>50)
                    {
                       System.out.println(" Age Exception");
                       throw
                              new Exception();
                     }
                Number obj=new Number();
                System.out.println("object created--");     //if name and age match then print OBJECT CREATED
          }
        catch(Exception e)
          {
             System.out.println("Exception");
           }
       }
} 
