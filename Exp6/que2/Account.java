package Balance;
import java.util.Scanner;
 public class Account
{          
          int salary,incr_sala,percentage,S;
     public void Display_Balance()
        {
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter the salary");
            salary=sc.nextInt();   
            System.out.println("enter the percentage percentage ");
            percentage=sc.nextInt();  
             S=(salary*percentage)/100; 
           System.out.println(" percent is :"+S);
           incr_sala=salary+S;
            System.out.println("increment salary is :- "+incr_sala);
        }
}
