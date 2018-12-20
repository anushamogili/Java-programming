import java.awt.*;
import java.util.Scanner;
import java.net.InetAddress;
public class ip{

public static void main(String[] args) throws Exception
{
//Scanner scanner = new Scanner(System.in);
InetAddress myIP=InetAddress.getLocalHost();
System.out.println("My Ip is");
System.out.println(myIP.getHostAddress());
//a = scanner.nextInt();
}
}
