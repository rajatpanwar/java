import java.util.*;
class Multi extends Thread
{
    public void run()
  {     
     for(int i=0;i<5;i++)
      {
    System.out.println("Rajat....");
      }
   }
}
class Demo
{
      Demo()
       {
         Multi obj1=new Multi();
          obj1.start();

         }
}

 class Multi1 implements Runnable
{
        public void run()
         {
           System.out.println("thread is running....");
          }
}
class Threadrunnable
{
      Threadrunnable()
        {
           Multi1 m=new Multi1();
           Thread t1=new Thread(m);
             t1.start();
         }
}


public class Main
{
       public static void main(String[] args)
   { 
       Demo obj=new Demo();
       Threadrunnable obj1=new Threadrunnable();
    }
}






 




         
