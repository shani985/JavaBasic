import java.util.Scanner;
class pelindrom
{
public static void main(String []args)
{
int n,b,r;
long pelin=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");

n=sc.nextInt();
b=n;
while(n>0)
{
r=n%10;
pelin=pelin*10+r;
n=n/10;
}
if(pelin==b)
{
System.out.println("number is pelindrom="+pelin);
}
else
{
System.out.println("number is not pelindrom="+pelin);
}
}
}