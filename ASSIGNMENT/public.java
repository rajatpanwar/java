import java.util.*;

interface sales
{
	void sale();
}
class publication implements sales
{
	Scanner sc=new Scanner(System.in);
	publication()
	{
		System.out.println("Select among (1)book and (2)tape");
		int option=sc.nexInt();
		if(option == 1)
		{
			book obj=new book();
			
		}
		else if(option == 2)
		{
			tape obj2=new tape();
		}
	}
