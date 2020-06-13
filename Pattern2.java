public class Pattern2
{
public static void main(String[] args)
{
for(int i=1;i<=4;i++)                 //number of rows
{
for(int j=1;j<=4;j++)                 //number of columns
{
if(i==1 || i==4 || j==1 || j==3)       //where we need to print the stars
{
System.out.print("* ");
}
else
System.out.print(" ");
}
System.out.println(" ");
}
}
}


//output-
* * * *
*     *
*     *
* * * *
