import java.util.Scanner;
class armstrong
{
public static void main(String []args)
{
int n,r,c;
long arm=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
c=n;
while(n>0)
{
r=n%10;
arm=arm+(r*r*r);
n=n/10;
}
if(arm==c)
{
System.out.println("number is armstrong="+arm);
}
else
{
System.out.println("number is not armstrong="+arm);
}
}
}
