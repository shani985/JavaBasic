
import java.util.Arrays;
import java.util.Scanner;
class As_sort
{
public static void main(String []args)
{
int i,size;
Scanner r=new Scanner(System.in);
System.out.println("enter the size of array");
size=r.nextInt();
int a[]=new int[size];
System.out.println("enter the number of array element");
for(i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
Arrays.sort(a);
System.out.println("sort array element");
for(i=0;i<a.length;i++)
{
System.out.println("\t"+a[i]);
}
}
}
