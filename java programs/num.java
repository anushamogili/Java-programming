import java.awt.*;
import java.util.Scanner;
public class num{

public static void main(String[] args) {
int n;
Scanner scanner = new Scanner(System.in);
System.out.println("enter no");
n = scanner.nextInt();
if(n>0)
{
System.out.println("+ve no");
}
else if(n<0)
{
System.out.println("-ve no");
}
else
{
System.out.println("neither");
}
}
}
