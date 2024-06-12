import java.util.Scanner;
class user
{
	int a;
	float b;
	long c;
	double d;
	String e;
	String f;
	byte g;
	short h;
	Scanner r=new Scanner(System.in);
	void show()
	{
		System.out.println("enter the value of integer;");
		a=r.nextInt();
		System.out.println("enter the value of float;");
		b=r.nextFloat();
		System.out.println("enter the value of long;");
		c=r.nextLong();
		System.out.println("enter the value of Doubler;");
		d=r.nextDouble();
		System.out.println("enter the value of String;");
		e=r.next();
		System.out.println("enter the value of String;");	
		f=r.nextLine();
		System.out.println("enter the value of byte;");
		try
		{
			g=r.nextByte();
		}catch(Exception e)
		{
		System.out.println("enter the small number");
		}	
		System.out.println("enter the value of short;");
		h=r.nextShort();
		System.out.println("integer number is \t"+a);
		System.out.println("floating number is \t"+b);
		System.out.println("long number is \t"+c);
		System.out.println("double number is \t"+d);
		System.out.println("string  number is \t"+e);
		System.out.println("string number is \t"+f);
		System.out.println("byte number is \t"+g);
		System.out.println("short number is \t"+h);
}
}
class test
{
	public static void main(String []args)
	{
		user m=new user();
		m.show();
	}

}



