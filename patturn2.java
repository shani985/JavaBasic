import java.util.Scanner;
class patturn2
{
public static void main(String []args)
{
int i,j,n;
System .out.println("enter the value of n");
Scanner r=new Scanner(System.in);
n=r.nextInt();
for(i=0;i<n;i++)
{
for(j=i;j<n;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}

