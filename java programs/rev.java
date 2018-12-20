import java.awt.*;
import java.util.Scanner;
public class rev{

public static void main(String[] args) {
int i;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter no of values ");
int num = scanner.nextInt();
int name[]= new int[num];
for (i=0;i < name.length; i++)
{
System.out.println("Enter value "+i+"");
int count = scanner.nextInt(); 
name[i]=count;
}
//System.out.println(name);
for(i=name.length-1;i>=0;i--)
{
System.out.println(name[i]);
}

}
}