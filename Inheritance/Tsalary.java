 class Vinod
{       
   int i=80000;
   int j=85000;
   void salary()
   { 
        System.out.println("Vinod's Salary is :" +i);
   }
}

class Naresh extends Vinod       //Inherit the property
{
    void salary1()
      {
        System.out.println("Naresh's Salary is :" +j);
      }
}

public class Tsalary
{
    public static void main(String[] args)
      {                                                                        
            Naresh S=new Naresh();            //create a object of drived class not need to vinod class
            S.salary();
            S.salary1();
       }
 }
