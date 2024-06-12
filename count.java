import java.util.Scanner;
class count
	{
		public static void main(String []args)
			{
				long n ,count=0;
				System.out.println("enter the number" );
				Scanner r=new Scanner(System.in);
				n=r.nextLong();
				while(n>0)
					{
						n=n/10;
						count ++;
					}
				System.out.println(count);
			}
	}
				