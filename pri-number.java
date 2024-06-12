import java.util.Scanner;
class pri_number
{
public static void main(String []args)
{
int n1,n2,i,j;
Scanner r=new Scanner(System.in);
System.out.println("enter the two number");
n1=r.nextInt();
n2=r.nextInt();
for(i=n1;i<=n2;i++
{
for(j=2;j<=i;j++)
{
if(i%j==0)
break;
}
}
if(i==j)
{
System.out.println("prime number"+j);
}
}
}
