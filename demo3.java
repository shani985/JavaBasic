import java.util.Scanner;
class natural_number
{
	void show()
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of range");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i);
			sum+=i;
		}
	
			System.out.println("\nsum of natural number="+sum);

	}
}
class demo3
{
	public static void main(String []args)
	{
		natural_number r=new natural_number();
		r.show();
	}
}
