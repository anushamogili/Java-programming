import java.awt.*;
import java.util.Scanner;

class sqr {

    public static void main(String[] args) {
//int l,b;
    	
        Scanner scan=new Scanner(System.in);
System.out.print("Enter side of square:");
        double  s = scan.nextDouble();
//System.out.print("Enter breath of rectangle:");
  //      double  h = scan.nextDouble();
double area=0;
area=s*s;
System.out.println("area of the rectangle is " +area);
}
}