import java.util.Scanner;
class Array_sort
{
public static void main(String []args)
{
int i,size ,temp,j;
Scanner r=new Scanner(System.in);
System.out.println("enter the array size");
size=r.nextInt();
int a[]=new int[size];
System.out.println("enter the array elemnet");
for(i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
System.out.println("preint array element is");
for(i=0;i<a.length;i++)
{
System.out.print("\t"+a[i]);
}
for(i=0;i<a.length;i++)
{
for(j=1+i;j<a.length;j++)
{
/*if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}*/
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("\narray elemnet is sort");
for(i=0;i<a.length;i++)
{
System.out.print("\t"+a[i]);
}
}
}
