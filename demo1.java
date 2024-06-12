import java.util.Scanner;
class even_odd
{
	int n;

	
	void show()
	{
		Scanner r=new Scanner(System.in);
		System.out.println("enter the number");
		n=r.nextInt();
		if(n%2==0)
		{
			System.out.println("number is even="+n);
		}
		else
		{
			System.out.println("number is odd="+n);
		
		}
	}
}
class demo1
{
	public static void main(String []args)
	{
		even_odd m=new even_odd();
		m.show();
	}
}

	
