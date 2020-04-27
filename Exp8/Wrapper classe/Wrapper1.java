public class Wrapper1
{
  public static void main(String[] args)
{
   
    String s="20.5";
     float f=Float.parseFloat(s);                        //convert String to float
    System.out.println("Convert String to float:--"+f);


    System.out.println("CONVERT float TO Float-----------");
      float f1=10.56f;
     System.out.println("original value is :--"+f1);
      Float F=new Float(f1);                               //CONVERT float to Float
      System.out.println("convert float to Float :--"+F);

  
     System.out.println("CONVERT---float to String-----IS ");       //CONVERT float to String 
       float f2=12.3F;
       System.out.println("original value is--: "+f2);  
       String s1=String.valueOf(f2);  
       System.out.println("convert float to String---:"+s1); 


     
}
}
