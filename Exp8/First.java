import java.io.*;
import java.util.*;

public class First
{
    
    public static void main(String[] args)
       {
             String str="I am Rajat Panwar";

           int firstocc = str.indexOf('a');                            
            System.out.println("First occurrence of 'a' is" +firstocc);

           
            int lastocc = str.lastIndexOf('a');
             System.out.println("last occurrence of 'a' is " +lastocc);
           
               
             int lastin = str.lastIndexOf("am");
              System.out.println("index  of last substring 'am' is:- "+lastin);
        }
}
