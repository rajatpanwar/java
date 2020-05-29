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
	
void page()
	{
		System.out.println("Enter the number of page in book");
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
	~book();
}
class tape extends publication
{
	Scanner s=new Scanner(System.in);
	String[] titt=new String[10];
	float[] pre=new float[10];	
	float time=new float[10];
	int num=0;	
	tape()
	{
		num++;
		for(int k=0;k<num;k++)
		{
		System.out.println("Enter the title of tape");
		titt[k]=title();
		System.out.println("Enter the price of tape");
		pre[k]=price();
		System.out.println("Enter the play time");
		time[k]=playing();
		}
	}
	void playing()
	{
		float tim=s.nextFlaot();
		return tim;
	}
	void display()
	{
		for(int y=0;y<number;y++)
		{
			System.out.println("title="+titt[k]+ "price ="+pre[k]+" playing time="+time[y]);
			
		}
	}
	~tape();
}
public class music
{
	public static void main(String[] args)
	{
		publication ma=new publication();
		
	}
}
