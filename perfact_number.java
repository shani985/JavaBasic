import java.util.Scanner;
class perfact_number{
public static void main(String []args)
{
int i,n,sum=0;
Scanner r=new Scanner(System.in);
System.out.println("enter the number");
n=r.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(n==sum)
{
System.out.println("number is perfact ");
}
else
{
System.out.println("number is not perfact");
}
}
}