import java. util.Scanner;
class tax
{
	public static void main(String []args)
		{
			int sel;
			double tax;

			Scanner r=new Scanner(System.in);
			System.out.println("enter the selary");
			sel=r.nextInt();
			if(sel<=10000)
				System.out.println("no tax");
			else if(sel>10000&&sel<=100000)
				{
					tax=sel*0.10;
					System.out.println("selary ="+sel+"\t tax="+tax);
				}
			else
				{
					tax=sel*0.20;
					System.out.println("selary ="+sel+"\t tax="+tax);
				}
		}
}
			
