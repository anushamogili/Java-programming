import java.awt.*;
import java.util.Scanner;
public class sumnat{

public static void main(String[] args) {
int n;
Scanner scanner = new Scanner(System.in);
System.out.println("enter no");
n = scanner.nextInt();
scan.close();
int total = 0, i = 1;
for(i=0; i<=n; i++)
{
total = total + i;
}
System.out.println("Sum of first 10 natural numbers is:"+total);


while(i <= n)
{
total = total + i;
i++;
}
System.out.println("Sum of first 10 natural numbers is:"+total);
}
}