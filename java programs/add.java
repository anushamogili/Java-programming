import java.awt.*;
import java.util.Scanner;
public class add{

public static void main(String[] args) {
int c;
int a;
int b;
int e;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a value");
a = scanner.nextInt();
System.out.println("Enter b value");
b = scanner.nextInt();
c=a+b;
e=a*b;
//System.out.println("c");
System.out.println(""+a+" + "+b+" is "+c+"");
System.out.println(""+a+" + "+b+" is "+e+"");
}
}
