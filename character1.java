import java.util.Scanner;
class character1
{
	public static void main(String []args)
		{
			char ch;

			Scanner sc=new Scanner(System.in);
			System.out.println("enter the character");
			ch=sc.next().charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					System.out.println("character is vowel "+ch);
				}
			else
				{
					System.out.println("character is consonent "+ch);
				}
	}
}