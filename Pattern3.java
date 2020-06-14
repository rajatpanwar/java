public class Pattern3
{
public static void main(String[] args)
{
for(int i=1;i<=5;i++)     //number of rows
{
for(int j=1;j<=i;j++)     //number of columns
{
if((i+j)%2==0)                  //figure out the positions where we need to print 1 and 0
System.out.print("1");
else
System.out.print("0");
}
System.out.println(" ");
}
}
}



//output-
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 
