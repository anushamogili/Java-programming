import java.awt.*;
import java.util.Scanner;

class tri {

    public static void main(String[] args) {
//int l,b;
    	
        Scanner scan=new Scanner(System.in);
System.out.print("Enter length of trinagle:");
        double  l = scan.nextDouble();
System.out.print("Enter height of triangle:");
        double  h = scan.nextDouble();
double area=0;
area=l*h;
area=area/2;
System.out.println("area of the triangle is " +area);
}
}