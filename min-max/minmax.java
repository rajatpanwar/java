import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
        long temp,max=0,min=0;
        for(int p=0;p<arr.length-1;p++)
           {  for(int k=0;k<arr.length-1-p;k++)
              {
                  if(arr[k]<arr[k+1])
                  {
                      temp=arr[k];
                      arr[k]=arr[k+1];
                      arr[k+1]=temp;
                  }
              }
            
           }
            for(int h=0;h<arr.length-1;h++)
            {  min=min+arr[h];
               max=max+arr[arr.length-h-1];
            }
             System.out.println(max+" "+min);
            

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}

