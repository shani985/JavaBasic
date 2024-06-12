import java.util.Scanner;
class days
{
	public static void main(String []args)
	{
	int n;
	Scanner r=new Scanner(System.in);
	System.out.println("enter the number of range of days");
	
	n=r.nextInt();
	switch(n)
	{
		case 1:
		System.out.println("to day is manday");
		break;

		case 2:
		System.out.println("to day is tuesday");
		break;

		case 3:
		System.out.println("to day is wednesday");
		break;

		case 4:
		System.out.println("to day is thursday");
		break;

		case 5:
		System.out.println("to day is friday");
		break;

		case 6:
		System.out.println("to day is saturday");
		break;

		case 7:
		System.out.println("to day is sunday");
		break;

		default:
		System.out.println("invalid choice");
	}
	}
}

