import java.util.Scanner;
class average
	{
		public static void main(String []args)
			{
				int HIN,ENG,PHY,CHE,MATH;
				float sum=0,average=0;
				Scanner r=new Scanner(System.in);
				System.out.println("enter the number of hindi");
				HIN=r.nextInt();
				System.out.println("enter the number of english");
				ENG=r.nextInt();
				System.out.println("enter the number of physics");
				PHY=r.nextInt();
				System.out.println("enter the number of chemistry");
				CHE=r.nextInt();
				System.out.println("enter the number of math");
				MATH=r.nextInt();
				sum=HIN+ENG+PHY+CHE+MATH;
				System.out.println("sum of all subject="+sum);
				average=sum*100/500;
				System.out.println("average is ="+average);
			}
	}
				