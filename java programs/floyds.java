import java.awt.*;
import java.util.*;
public class floyds{
public static void main(String[] args) {
int number=1;
Scanner scanner= new Scanner(System.in);
System.out.println("Enter the no of rows");
int r= scanner.nextInt();
for(int i=1; i<=r; i++){
for(int j=1; j<=i; j++, number++){
System.out.print(number+" ");
//number++;
}
System.out.println("\t");
}
//return 0;
}
}
