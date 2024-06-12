import java.util.Scanner;
class m
{
	void show()
	{
		int n,count=0;
		Scanner Sc=new Scanner(System.in);	
		System.out.println("enter the number of range ");
		n=Sc.nextInt();
		//System.out.println("even number is");
		System.out.println("odd number is");
		/*
		for(int i=1;i<=n;i++)
		{	//even number find
			if(i%2==0)
			{
				System.out.print("\t"+i);
				count ++;
			}
			if(i%2!=0)
			{  //odd number find
				System.out.print("\t"+i);
				count ++;
			}
		}*/
		//number is even
		/*for(int i=2;i<n;i+=2)
		{
		
				System.out.print("\t"+i);
				count ++;
		}
		*/
		for(int i=1;i<n;i+=2)
		{
		
				System.out.print("\t"+i);
				count ++;
		}		
				
		System.out.println("\n total odd number is ="+count);
	}
}
class test1
{
	public static void main(String []args)
	{
		
		m r=new m();
		r.show();
	}
	
}