import java.util.Scanner;
class swap
{
	public static void main(String []args)
		{
			int a,b;
			int temp;
			Scanner r=new Scanner(System.in);
			System.out.println("enter the two number");
			a=r.nextInt();
			b=r.nextInt();	
			/*a=a+b;
			b=a-b;
			a=a-b;*/
			temp=a;
			a=b;
			b=temp;
			System.out.println(a+"  "+b);
		}
}
				