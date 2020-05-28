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
class book extends publication
{
	Scanner in=new Scanner(System.in);
	String[] titl= new String[10];
	int[] count=new int[10];
	float[] pri=new float[10];
	int[] pag= new int[10];
	int number=1;
	book()
	{
	}
	void jok()
	{
		number++;
		for(int i=0;i<number-1;i++)
		{
			System.out.println("Enter the title of the book");
			titl[i]=title();
			System.out.println("Enter the price of the book");
			pri[i]=price();
			System.out.println("Enter the page of book");
			pag[i]=page();
		}
	}
	int page()
	{
		
		int pagno=in.nextInt();
		return pagno;
	}
	void display()
	{
		for(int j=0;j<number;j++)
		{
			System.out.println("title="+titl[j]+ "price ="+pri[j]+" page="+pag[j]);
		}
	}
	}	
class tape extends publication
{
	Scanner s=new Scanner(System.in);
	String[] titt=new String[10];
	float[] pre=new float[10];	
	float[] time=new float[10];
	int num=1;	
	tape()
	{
	}
	void moi()
	{
		num++;
		for(int k=0;k<num-1;k++)
		{
		System.out.println("Enter the title of tape");
		titt[k]=title();
		System.out.println("Enter the price of tape");
		pre[k]=price();
		System.out.println("Enter the play time");
		time[k]=playing();
		}
	}
	float playing()
	{
		float tim=s.nextFloat();
		return tim;
	}
	void display()
	{
		for(int y=0;y<num;y++)
		{
			System.out.println("title="+titt[y]+ "price ="+pre[y]+" playing time="+time[y]);
			
		}
	}
	
}
public class music
{
	public static void main(String[] args)
	{
		System.out.println("\t\t Welcome to the store");
		publication ma=new publication();
		
		
		ma.show();
	}
}
