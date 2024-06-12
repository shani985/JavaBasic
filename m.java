import java.util.Scanner;
import java.util.Arrays;
class m
{
public static void main(String args[])
{
int i,size;
System.out.println("enter the size of array elemnet");
Scanner r=new Scanner(System.in);
size=r.nextInt();
int a[]=new int[size];
System.out.println("enter the array element");
for(i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
System.out.println("copy array element another array");
//int b[]=new int[size];
int b[]=Arrays.copyOf(a,size+1);
b[5]=57;
for(i=0;i<a.length+1;i++)
{
System.out.print("\t"+b[i]);
}
}
}