import java.util.Scanner;
class number
	{
		public static void main(String[] args)
			{
				int n;
				Scanner r=new Scanner(System.in);
				System.out.println("enter the number");
				n=r.nextInt();
				if(n>=0)
				{
				System.out.println("number is positive "+n);
				}
				else
				{
				System.out.println("number is negative "+n);
				}
			}
	}
						
