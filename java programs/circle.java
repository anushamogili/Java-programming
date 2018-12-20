import java.awt.*;
import java.util.Scanner;

class circle {

    public static void main(String[] args) {
//int l,b;
    	
        Scanner scan=new Scanner(System.in);
System.out.print("Enter radius of circle:");
        double  r = scan.nextDouble();
//System.out.print("Enter height of triangle:");
       // double  h = scan.nextDouble();
double area=0, circumference=0;
circumference=2*Math.PI*r;
area=Math.PI*r*r;
System.out.println("area of the circle is " +area);
System.out.println("circumference of the circle  is " +circumference);
}
}