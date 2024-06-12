
import java.util.Scanner;
class year
	{
		public static void main(String []args)
			{
				int year;
				System.out.println("enter the year");
				Scanner r=new Scanner(System.in);
				year=r.nextInt();
				if(year%100==0&&year%400==0||year%100!=0&&year%4==0)
				{
					System.out.println("year is leap "+year);
				}
				else
				{

					System.out.println("year is not leap "+year);
				}
			
			}
	}	
				