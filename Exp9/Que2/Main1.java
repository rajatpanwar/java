import java.util.*;
class Multi extends Thread
{
        public void run()
        { 
           for(int i=0;i<10;i++)
              {
                 if(i % 2 == 0)                           //check the no is even
                  {
                     System.out.println("even number: " +i);
                   }
               }
          }
}

class Multi1 extends Thread
{
     public void run()
     {
        for(int i=0;i<10;i++)
          {
              if(i % 2 == 1)                            //check the no is odd
                {
                  System.out.println("odd number: " +i);
                 }
          }
      }
}

public class Main1
{
    public static void main(String[] args)
       {
            Multi t=new Multi();
            t.start();
            Multi1 t1=new Multi1();
             t1.start();
         }
}
              
