import java.awt.*;
import java.util.*;
public class random{
public static void main(String[] args) {
int i;
Random ran = new Random();
System.out.println("Random no");
for(i=1;i<=5;i++)
{
System.out.println(ran.nextInt(500));
}
}
}