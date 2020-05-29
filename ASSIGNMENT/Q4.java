import java.util.*;
import java.io.*;
class Account
{  String name,type;
   int accno;
   float balance=0,balance1=0;
   Scanner sc=new Scanner(System.in);

   Account(int p, int k, String g)
  {System.out.print("enter the name:");
   name=sc.nextLine();
   accno=k;
   type=g;
   if(type.equals("current"))
   balance=p;  
   else
   balance1=p;
  }

}

