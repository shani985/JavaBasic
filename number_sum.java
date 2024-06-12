import java.util.Scanner;
class number_sum
{
public static void main(String []args)
{
int n;
int m;
long sum=0;
Scanner r=new Scanner(System.in);
System.out.println("enter the number ");
n=r.nextInt();
while(n>0)
{
m=n%10;
sum=sum+m;
n=n/10;
}
System.out.println("sum of number ="+sum);
}
}