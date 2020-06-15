public class Fibonacci
{
  public static void main(String[] args)
  {
    int a,b,c;
    a=0;
    b=1;
    c=1;
    System.out.println("1 1");   //fibonacci series gives the sum of two previous numbers as the next number.
    while(a<=50)
    {
      a=b+c;
      System.out.println(a+" ");
      b=c;
      c=a;
    }
  }
}
