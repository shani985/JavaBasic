import java.util.Scanner;
class Array_reverse2
{
public static void main(String []args)
{
int i,size;
Scanner r=new Scanner(System.in);
System.out.println("enter the size");
size=r.nextInt();
int a[]=new int[size];
System.out.println("enter the array element");
for(i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
System .out.println("print array is ");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");
}

System.out.println("reverse array is");
for(i=a.length-1;i>=0;i--)
{
System.out.println(a[i]+" ");
}
System.out.println("length is ="+a.length);
}
}
