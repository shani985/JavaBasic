import java.util.Scanner;
class Array_search
{
public static void main(String []args)
{
int i,size,item,count=0;
Scanner r=new Scanner(System.in);
System.out.println("enter the array size ");
size=r.nextInt();
int a[]=new int[size];
System.out.println("enter the array element");
for(i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
System.out.println("enter the search element:");
item=r.nextInt();
System.out.println("array element ");
for(i=0;i<a.length;i++)
{
if(a[i]==item)
{n
count++;
}
}
if(count>0)
{
System.out.println("element "+item+ " is found="+count);
}
else
{
System.out.println("element "+item+" is not found ="+count);
}
}
}


