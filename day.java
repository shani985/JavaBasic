import java.util.Scanner;
class day
{
	public static void main(String []args)
	{
	int n;
	Scanner r=new Scanner(System.in);
	System.out.println("enter the number of range of days");
	
	n=r.nextInt();
	Switch(1)
	{
		case1:
		System.out.println("to day is manday");
		break;

		case2:
		System.out.println("to day is tuesday");
		break;

		case3:
		System.out.println("to day is wednesday");
		break;

		case4:
		System.out.println("to day is thursday");
		break;

		case5:
		System.out.println("to day is friday");
		break;

		case6:
		System.out.println("to day is saturday");
		break;

		case7:
		System.out.println("to day is sunday");
		break;

		defualt:
		System.out.println("invalid choice");
	}
	}
}

