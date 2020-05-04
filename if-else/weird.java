import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


  public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String sol=" ";
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         if(N%2!=0)
         {
             sol = ("Weird");
         }
         else{
            if(N>=2&&N<=5)      //if no between 2 and 5 print not wierd
            {
              sol = ("Not Weird");  
            }
            else if(N>=6&&N<=20)
            {
                sol = ("Weird");
            }
            else
            {
                sol = ("Not Weird");
            }
         }
        System.out.println(sol);

        scanner.close();
    }
}
