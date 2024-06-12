import java.util.Scanner;
class cal
{
	public static void main(String []args)
		{
			int n1,n2,op;
			System.out.println("enter the two input");
			Scanner Sc=new Scanner(System.in);
			n1=Sc.nextInt();
			n2=Sc.nextInt();
			System.out.println("enter the operation number");
			op=Sc.nextInt();
			if(op==1)
			{
				System.out.println("sum of two number="+(n1+n2));
			}
			else if(op==2)
			{
				System.out.println("subtruction of twp number="+(n1-n2));
			}
			else if(op==3)
			{
				System.out.println("multiplication of two number="+(n1*n2));
			}
			
			else if(op==4)
			{
				System.out.println("devision of two number="+(n1/n2));
			}
			else if(op==5)
			{
				System.out.println("remainder of two number="+(n1%n2));
			}
		}

}