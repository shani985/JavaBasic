import java.util.Scanner;
class Array_add
{
public static void main(String []args)
{

int i ,size,add=0;
Scanner r=new Scanner(System.in);
System.out.println("enter the array size");
size=r.nextInt();
int a[]=new int[size];
System.out.println("enter the array element ");
for(i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
System.out.println("array is ");
for(i=0;i<a.length;i++)
{
System.out.print("\t"+a[i]);
add=add+a[i];
}
System.out.println("\narray sum ia="+add);
}
}
