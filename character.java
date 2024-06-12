import java.util.Scanner;
class character
{
	public static void main(String []args)
	{
		char ch;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		ch=sc.next().charAt(0);

		System.out.println(ch);
	}
}

