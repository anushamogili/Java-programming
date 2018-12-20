import java.awt.*;
import java.util.Scanner;
public class inc{

public static void main(String[] args) {
int a=9;
int b=++a;
int e=a++;
int c=b--;
int d=a++-b-c--; //a=10  -b=-9  c=b=9 
int f = -b;
System.out.println(a + ", =a");
System.out.println(b + ", =b");
System.out.println(c + ", =c");
System.out.println(d + ", =d");
System.out.println(e + ", =e");
System.out.println(f + ", =f");
}
}
