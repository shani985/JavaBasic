import java.util.Scanner;
class patturn6
{
public static void main(String []args)
{
int i,j,k,n;
System.out.println("enter the value of n");
Scanner r=new Scanner(System.in);
n=r.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0||j==0||	j==4||i==4)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}