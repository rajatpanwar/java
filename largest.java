public class Largest
{
   public static void main(String args[])
   
   {
        int a,b,c;   //local variable
     a=Integer.parseInt(args[0]);
     b=Integer.parseInt(args[1]);
     c=Integer.parseInt(args[2]);
       
      if(a>b&&a>c)     //compare variable with two other variable
       {
    	 System.out.println(a+ "largest number");     //print largest number

       }
       else if(b>a&&b>c)
        {
          System.out.println(b+ "largest number");
         }
        
      else
        {System.out.println(c+ "largest number");
        }
}
}
