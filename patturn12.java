import java.util.Scanner;
class patturn12
{
public static void main(String []args)
 {
char i,j;
char n; 
System.out.println("enter the value of n");
Scanner r=new Scanner(System.in);
n=r.next().charAt(0); 
for(i='A';i<=n;i++) 
{ 
for(j='A';j<=i;j++) 
{ 
System.out.print(i); 
} 

System.out.println();
} 
}
}