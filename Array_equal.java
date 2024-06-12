import java.util.Scanner;
import java.util.Arrays;
class Array_equal
{
public static void main(String []args)
{
int i,size;
Scanner r=new Scanner(System.in);
size=r.nextInt();
int a[]=new int[size];
int a1[]=new int[size];
System.out.println("enter the element of array 1");
for(i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}

System.out.println("enter the elemnet of array 2");
for(i=0;i<a.length;i++)
{
a1[i]=r.nextInt();
}
boolean b=Arrays.equals(a,a1);
System.out.println("both array are equal "+b);
}
}
