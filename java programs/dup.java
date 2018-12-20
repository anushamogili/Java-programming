import java.awt.*;
import java.util.Scanner;
//import java.net.InetAddress;
public class dup{

public static void main(String[] args)
{
String a= "anushaaaaaa";
int cnt=0;
char[] inp=a.toCharArray();
//Scanner scanner = new Scanner(System.in);
//InetAddress myIP=InetAddress.getLocalHost();

for(int i=0; i<a.length(); i++)
{
for(int j=i+1; j<a.length(); j++)
{
//int counter= 0;
if(inp[i]== inp[j])
{
System.out.println(inp[j]);
cnt++;
break;
//System.out.println(myIP.getHostAddress());
//a = scanner.nextInt();
}
}
}
}
}
