import java.util.Scanner;
class ractangle
{
	public static void main(String []args)
		{
			int length,breadth;
			Scanner r=new Scanner(System.in);
			System.out.println("enter the length");
			length=r.nextInt();
			System.out.println("enter the breadth");
			breadth=r.nextInt();
			System.out.println("area of ractangle="+(length*breadth));
		}
}
