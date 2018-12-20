import java.awt.*;
import java.util.Scanner;
import java.io.*;
public class average {

public static void main(String args[]) {

int total= 0;
int i, j, k;
Scanner avg = new Scanner(System.in);
System.out.println("enter the number of numbers:");
int num = avg.nextInt();
int[] a= new int[num];
System.out.println("enter the number");
for( i=0; i < a.length; i++)
{
int count = avg.nextInt();
a[i] = count;
}
for( k=a.length-1;k>=0;k++)
{
System.out.print(i);
}
//System.out.println(a[i]);
for(j=0; j < a.length;j++)
{
total=total+a[i];
}
System.out.println(total);
int av=total/a[i];
System.out.println(av);
}
}