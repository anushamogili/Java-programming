import java.awt.*;
import java.util.Scanner;
public class revnum{

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("enter no of elements");
int num = scanner.nextInt();
int reverse = 0, remainder;
while( num != 0 )
      {
          remainder = num % 10;
          reverse = reverse * 10 + remainder;
          num = num/10;
      }

      System.out.println("Reverse of input number is: "+reverse);
for(;num != 0;)
{
remainder = num % 10;
          reverse = reverse * 10 + remainder;
          num = num/10;
}

   }
}

