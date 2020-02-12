import java.util.Scanner;
public class Square1
{
    public static int SquareSum(int a[]) 
    {
        
        int sum=0;
        
        int square=0;
                                  //for loop to square and sum of elements
        for(int i=0;i<10;i++)
        {
            square=a[i]*a[i];
            sum=sum+square;
        }
                          //return the sum variable;
        return sum;
    }

    public static void main(String[] args) 
    {
        int j=0;
                                 //create array 
        int[] arr=new int[10];
                                   //declare the scanner class
        Scanner sc=new Scanner(System.in);
       
                                             //take array element
        System.out.println("enter element");
        for(int i=0;i<10;i++)
              arr[i]=sc.nextInt();
                                               //print sum from calling the fuction SquareSum
        System.out.print("square sum of element "+SquareSum(arr));
     }
}
