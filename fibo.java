import java.util.Scanner;
class fibo
{
public static void main(String []args)
{
int term,i,a=0,b=1,c;
System.out.print("enter term");
Scanner r=new Scanner(System.in);
term=r.nextInt();
System.out.println("fibonaaci seriese");
for(i=0;i<term;i++)
{
System.out.print("\t "+a);
c=a+b;
a=b;
b=c;
}
}
}