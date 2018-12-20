import java.awt.*;
import java.util.Scanner;

class rec {

    public static void main(String[] args) {
//int l,b;
    	
        Scanner scan=new Scanner(System.in);
System.out.print("Enter length of rectangle:");
        double  l = scan.nextDouble();
System.out.print("Enter breath of rectangle:");
        double  b = scan.nextDouble();
double area=0;
area=l*b;
System.out.println("area of the rectangle is " +area);
}
}
 