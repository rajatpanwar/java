import java.util.*;

interface sales
{
	int sale();
}
class publication implements sales
{
	Scanner sc=new Scanner(System.in);
	publication()
	{
	}
	void show()
	{
		boolean t=true;
		while(t==true)
		{
		System.out.println("Select among (1)book , (2)tape , (3)Exit");
		int option=sc.nextInt();
		if(option == 1)
		{
			book obj=new book();
			System.out.println("1>add books ,2>display books");
			int opt=sc.nextInt();
			if(opt==1)
			{
				obj.jok();
			}
			else if(opt==2)
			{
				obj.display();
			}
			else
			{
				System.out.println("Wrong input");
			}
			
		}
		else if(option == 2)
		{
			tape obj2=new tape();
			System.out.println("1>add tape ,2>Display tape");
			int ko=sc.nextInt();
			if(ko==1)
			{
				obj2.moi();
				
			}
			else if(ko==2)
			{
				obj2.display();
			}
			else
			{
				System.out.println("Wrong input");
			}
		}
		else if(option==3)
		{
			t=false;
		}
		else
		{
			System.out.println("Wrong input");
		}
		}
	}
public int sale()
	{
		System.out.println("Enter the sales ");
		int sal=sc.nextInt();
		return sal;
	}
	String title()
	{
		String tit=sc.nextLine();
		
		return tit;
	}
	float price()
	{
		float pric=sc.nextFloat();
		return pric;
	}
	
}
