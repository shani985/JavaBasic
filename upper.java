
import java.util.Scanner;
class upper
{
	public static void main(String []args)
		{
			char ch,ch1;
			Scanner r=new Scanner(System.in);
			ch=r.next().charAt(0);
			if(ch>='A'&&ch<='Z')
				{
					ch1=character.tolowercase(ch);
					System.out.println("lower case"+ch1);

				}
			else
				{
					ch1=character.touppercase(ch);
					System.out.println("upper case"+ch1);
				}
		}
}
				
