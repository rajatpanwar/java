public class Fib
{ 
     public static void main(String args[])
     {
  	int a=0,b=1,c=10;        //declare variables
        for(int j=0;j<=10;j++)   //for loop to print fibonacci series
        {
          c=a+b;
 	  System.out.println(c);
        	a=b;
		b=c;
		}
	}
}
