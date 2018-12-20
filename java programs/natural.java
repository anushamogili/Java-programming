import java.awt.*;
import java.util.Scanner;
public class natural{

public static void main(String[] args) {
int n;
Scanner scanner = new Scanner(System.in);
System.out.println("enter no");
n = scanner.nextInt();
if(n>0 || n == 0)
{
System.out.println(" "+n+" is a natural number");
}
else
{
System.out.println(" "+n+" is not a natural number");
}
}
}
