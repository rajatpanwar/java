public class Wrapper
{
   public static void main(String[] args)
{
   int a=20;
   Integer i=Integer.valueOf(a);  //convert to int to integer(Autoboxing)   
   //Integer j=a;
   System.out.println("Original value of int:-"+a);
   System.out.println("Convert int to integer:-- "+i);


    
    System.out.println("Now WE LL CONVERT INTEGER TO INT------------");
    
     Integer b=new Integer(3);     //convert to integer to int(unboxing)
    int j=b.intValue(); 
  System.out.println("Original value of Integer:--"+b);
    System.out.println("Conver Integer to int:--"+j);

  System.out.println("CONVERT STRING TO INT--------------");

    String number="10";                                     //convert string to int
    System.out.println("Original value of String:-"+number);
    int result=Integer.parseInt(number);
     System.out.println("convert string to int:-"+result);

   System.out.println("CONVERT INT TO STRING-------------");
     int c=222;
     String str=String.valueOf(c);
     System.out.println("String is:-"+str);
      System.out.println(555+str);
}
}
