import java.util.Scanner;
class devisible
{
	public static void main(String []args)
	{
	int n;
	Scanner r=new Scanner(System.in);
	System.out.println("enter the number");
	n=r.nextInt();
	if(n%5==0)
		{
			System.out.println(n+" number is devisible by 5 ");
		}
	else
		{
			System.out.println(n+ " number is not devisible by 5");
		}
	}
}