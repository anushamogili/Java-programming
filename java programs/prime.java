import java.awt.*;
import java.util.Scanner;
public class Prime{

public static void main(String[] args) {
int n;
Scanner scanner = new Scanner(System.in);
System.out.println("enter the value of n:");
n = scanner.nextInt();
if(n>=1)
{
System.out.println("First "+n+" prime numbers are:");
}
for ( int i=2; i<=n; i++)
{
for ( int j=2; j<=i; j++)
{

if(i == j)
{
System.out.println(i);
}
if(i%j == 0)
{
//result = 0;
break;
}
}
}
}
}