import java.util.Scanner;
class Array_copy
{
public static void main(String []args)
{
int size,i;
Scanner r=new Scanner(System.in);
System.out.println("enter the size");
size=r.nextInt();
int a[]=new int[size];
int b[]=new int[size];
System.out.println("enter the array element");
for(i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
System.out.println("first array is ");
for(i=0;i<a.length;i++)
{
System.out.print("\t"+a[i]);
}
System.out.println("\nsecond array is ");
for(i=0;i<a.length;i++)
{
b[i]=a[i];
System.out.print("\t"+b[i]);
}
}
}

