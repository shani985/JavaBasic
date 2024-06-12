import java.util.Scanner;
class patturn15
{
public static void main(String []args)
 {
char i,j;
char n;
char count=65; 
System.out.println("enter the ch of n");
Scanner r=new Scanner(System.in);
n=r.next().charAt(0); 
for(i='A';i<=n;i++) 
{ 
for(j='A';j<=i;j++) 
{ 
System.out.print(count); 
count++;
} 

System.out.println();
} 
}
}