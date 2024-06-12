import java.util.Scanner;
class Add
{
	int a,b;
	void show()
	{
		Scanner r=new Scanner(System.in);
		System.out.println("enter the number first ");
		a=r.nextInt();
		System.out.println("enter the number second");
		b=r.nextInt();
		System.out.println("sum of two number="+(a+b));
	}
}
class demo2
{
	public static void main(String []args)
	{
		Add r=new Add();
		r.show();
	}
}		



	