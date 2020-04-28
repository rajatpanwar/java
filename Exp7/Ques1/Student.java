import java.util.*;
public class Student
{
        public static void main(String[] args)
         {
            upes Arr[]=new upes[10];
           try{
                for(int j=0;j<15;j++)
                 {
                     Arr[j]=new upes();
                    Arr[j].fun();
                  }
          }
    catch(ArrayIndexOutOfBoundsException e)
       {
            System.out.println("dont go out of array");
        }
          }
}
class upes
{         
Scanner sc=new Scanner(System.in);
        public void fun()
           { 
              System.out.println("enter the name : ");
               String name=sc.nextLine();
               System.out.println("Enter roll no : ");
                int rollno=sc.nextInt();
            }



}
