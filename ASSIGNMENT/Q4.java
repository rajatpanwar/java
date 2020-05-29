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
class Cur_acct extends Account      //inherit  the class
{   
    Cur_acct(int q,int w, String e)
   {super(q,w,e);}
    
     
    void chequebook()
    {System.out.println("new checkbook issued");}
  
    void minbalance()
    { if(balance1<500)
       { System.out.println("Service charges imposed");
         balance1=balance1-100;}
   
       else       
       System.out.println("you have sufficient balance");
     }
 
   void deposit()
   {System.out.print("enter the amount to deposit in current account:");
    float m=sc.nextFloat();
     balance1=balance1+m;
    }
    
   void display()
   {System.out.println("Your current balance is:"+" "+balance1);}

 
}

class Sav_acct extends Account
{ 
   Sav_acct(int q,int w, String e)
   {super(q,w,e);}
   
   void interest()
   { System.out.println("Bank gives 2% interest every month");
     balance=balance+(balance*2)/100;
     System.out.println("interest added to the account");
    } 

    void withdrawal()
    { System.out.print("enter the amount to withdraw:");
      float z=sc.nextFloat();
      if(z>balance)
      {System.out.println("insufficient balance");}
      else
      balance=balance-z;
      System.out.println("amount:"+" "+z+" "+"withdarwed");   
    }
    case 2: Random i = new Random();
                int n=i.nextInt(10000);
                s.nextLine();
                System.out.print("enter the account type:");
                String acc=s.nextLine();
           
                if(acc.equals("saving"))
                {Sav_acct obj1=new Sav_acct(0,n,"saving");
                 obj1.deposit();
                 obj1.interest();
                 obj1.withdrawal();
                 obj1.display(); 
                 }
                 else
                 {Cur_acct obj3=new Cur_acct(0,n,"current");
                 obj3.deposit();
                 obj3.minbalance();
                 obj3.chequebook();
                 obj3.display();
                 }
                 break;

          case 3: System.exit(0);
  
          default: System.out.println("invalid choise");
                   break;
         }
            
       }               

}
}

    
