import java.util.Scanner;
class patturn11
{
public static void main(String []args)
 {
int i,j,n,count=0 ; 
System.out.println("enter the value of n");
Scanner r=new Scanner(System.in);
n=r.nextInt(); 
for(i=1;i<=n;i++) 
{ 
for(j=1;j<=i;j++) 
{ 
count++;
System.out.print(count); 
} 

System.out.println();
} 
}
}