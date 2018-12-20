import java.awt.*;
import java.util.Scanner;
public class pry{

public static void main(String[] args) {
int n, num;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter n value");
n = scanner.nextInt();
System.out.println("pattern");
for(int i=0;i<n;i++){
num=1;
for(int k=i;k<n;k++){
System.out.print(" ");
for(int j=1;j<=i;j++){
System.out.print(num+ " ");
num++;
}
}
System.out.println();
}
}
}