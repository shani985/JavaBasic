import java.util.Scanner;
class patturn9
{
public static void main(String []args)
 {
int i,j,n; 
System.out.println("enter the value of n");
Scanner r=new Scanner(System.in);
n=r.nextInt(); 
for(i=1;i<=n;i++) 
{ 
for(j=1;j<=i;j++) 
{ 
System.out.print(j); 
} 

System.out.println();
} 
}
}