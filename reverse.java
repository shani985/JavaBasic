import java.util.Scanner;
class reverse
{
public static void main(String []args)
{
int n;
 int m;
long rev=0;
Scanner r=new Scanner(System.in);
System.out.println("enter the number");
n=r.nextInt();
/*while(n>0)
{
 rev=n%10;
System.out.println("reverse "+rev);
n=n/10;

}*/
while(n>0)
{
m=n%10;
rev=m+rev*10;
n=n/10;
}
System.out.println("reverse "+rev);
}
}