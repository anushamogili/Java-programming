import java.awt.*;
import java.util.Scanner;
public class leap{

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("enter year");
int num = scanner.nextInt();
//Scan.close();
if(num % 4 == 0)
{
if(num % 100 == 0)
{
if(num % 400 == 0)
{
System.out.println(""+num+" has 366 days. so it is a leap year");
}
}
}
else
{

System.out.println(""+num+" has 365 days. so it is not a leap year");
}

char ch = 'a';
int asciicode = ch;
int asciivalue = (int)ch;
System.out.println("ASCII value of "+ch+" is: " + asciiCode);
        System.out.println("ASCII value of "+ch+" is: " + asciiValue);
}
}