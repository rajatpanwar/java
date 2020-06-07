import java.util.*;
interface test                //create interface
{
	void square(int num);
}
 class arithmetic implements test
{
	public void square(int num)
	{
		int b=num*num;                               //assign the new variable its value  
		System.out.println(b);
	}
}
 public class Totest                                           //create public class
{
		public static void main(String[] args) 
		{
			System.out.println("enter the number to be sqared\n");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			
			arthmatic s=new arthmatic();
			s.square(a);
			sc.close();
		}

}

