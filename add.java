 package p2;
import java.util.Scanner; 
class Package
{      int a,b,c;
        
         void sum(int x,int y)
      {    a=x;
           b=y;
          c=a+b;
         System.out.println("sum is :"+c);

      }
          
}

public class Main
{
      public static void main(String[] args)
         {
             Scanner sc= new Scanner(System.in);
               System.out.println("enter two number");
              int x=sc.nextInt();
               int y=sc.nextInt();
               Package s=new Package();
                     s.sum(x,y);
                            

          }
}
