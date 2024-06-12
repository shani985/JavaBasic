import java.util.Scanner;
class abc
{
	public static void main(String []args)
		{
			int a,b,c;
			System.out.println("enter the value for side of tringle");
			Scanner r=new Scanner(System.in);
			a=r.nextInt();
			b=r.nextInt();
			c=r.nextInt();
			int sp=a*b*c/2;
			
      			double area = Math.sqrt(sp* (sp - a) * (sp - b) * (sp - c));
			System.out.println("area of triangle="+area);
		}
}