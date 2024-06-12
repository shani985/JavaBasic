import java.util.Scanner;
class patturn4
{
public static void main(String []args)
{
int i,j,k,n;
System.out.println("enter the value of n");
Scanner r=new Scanner(System.in);
n=r.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
{
System.out.print(" ");
}
for(k=i;k<n;k++)
{
System.out.print("*");
}
System.out.println();
}
}
}