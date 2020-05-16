import java.util.*;
public class Table
{
     public static void main(String[] args)
       {
           Scanner sc = new Scanner(System.in);
         System.out.println("<<----Enter the number which want you print the table---->>");
            int s=sc.nextInt();
           
           for(int i=1;i<11;i++)
              {
                 int T=s*i;
                System.out.println(s+"X"+i+"="+T);
               }
         }
}
