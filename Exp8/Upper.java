import java.util.*;
public class Upper
{
     public void toUpperCase(String s)
{          
        String str="";
        for(int x=0;x<s.length();x++)
           {
            char ch=s.charAt(x);
            if(ch>='a' && ch<='z')
                 str +=""+ (char)(ch-32);
            else
               str +="" +ch;
               

           }
              System.out.println(str);
}   
       //return str;
        
public static void main(String[] args)
{  Upper obj=new Upper(); 
    Scanner sc = new Scanner(System.in);
     System.out.println("enter the name");
       String s=sc.nextLine();
      //System.out.println("Upper case name is:-" +toUpperCase(s));
         System.out.println("Upper case name is:-");
           obj.toUpperCase(s);    

     
        
      
}
}
             
     
