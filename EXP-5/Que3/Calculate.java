import java.util.*;
interface pi
{
	final double pi=3.14;
}
public class calculate implements pi
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle\n");
		int rad=sc.nextInt();
		double cal=pi*rad*rad;
		System.out.println("area of circle is = "+ cal);
	}
}
