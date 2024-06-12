import java.util.Scanner;
class inserted_delete
{
public static void main(String args[])
{
int i,size,item,loc;
Scanner r=new Scanner(System.in);
System.out.println("enter the size of array element");
size=r.nextInt();
int a[]=new int[size];
System.out.println("enter the array element ");
for(i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
//System.out.println("enter the inserted element");
//item=r.nextInt();
System.out.println("enter the location of element");
loc=r.nextInt();
/*for(i=a.length;loc>i;i--)
{
a[i+1]=a[i];
}
a[loc]=item;
size++;
*/
for(i=loc;i<a.length-1;i++)
{
a[i]=a[i+1];
}
size--;
System.out.println("after inserted the element");
for(i=0;i<a.length-1;i++)
{
System.out.println("\t"+a[i]);
}
}
}


