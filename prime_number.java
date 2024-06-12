import java.util.Scanner;
class prime_number
{
public static void main(String []args)
{
int n,i,count=0;
Scanner r=new Scanner(System.in);
System.out.println("enter the number");
n=r.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("number is prime");
}
else
{
System.out.println("number is not prime");
}
}
}