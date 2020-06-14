public class Pattern3
{
public static void main(String[] args)
{
for(int a=1;a<=5;a++)     //number of rows
{
for(int b=1;b<=a;b++)     //number of columns
{
if((a+b)%2==0)                  //figure out the positions where we need to print 1 and 0
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
 
