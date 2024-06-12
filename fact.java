import java.util.Scanner;
class fact
	{
		public static void main(String []args)
			{

				int n,i,fact=1;
				Scanner r=new Scanner(System.in);
				System.out.println("enter the number");
				n=r.nextInt();
				for(i=1;i<=n;i++)
					{
						fact =fact*i;
					}
				System.out.println("factorial is ="+fact);
			}
	}