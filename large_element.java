import java.util.Scanner;
class large_element
{
public static void main(String []args)
{
int i,size;
Scanner r=new Scanner(System.in);
System.out.println("enter the number of array element");
size=r.nextInt();
int a[]=new int[size];
System.out.println("enter the array element ");
for( i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
//int mid=a[0];
 int small=a[0];
/*for(i=0;i<a.length;i++)
{
if(mid<a[i])
{
mid=a[i];
}
}*/
for(i=0;i<a.length;i++)
{
if(small>a[i])
{
small =a[i];
}
}
//System.out.println("large element"+mid);
System.out.println("smallest  element"+small);
}
}
