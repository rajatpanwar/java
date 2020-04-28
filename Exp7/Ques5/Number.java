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
            if(!name.matches("[a-zA-Z]+"))
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
                System.out.println("object created--");
          }
        catch(Exception e)
          {
             System.out.println("Exception");
           }
       }
} 
