import java.awt.*;
import java.util.*;
import java.util.Scanner;
public class pal{
public static void main(String[] args) {
int number=1;
Scanner scanner= new Scanner(System.in);
System.out.println("Enter a string");
String str= scanner.nextLine();
if(ispal(str))
System.out.println(str + "is a palindrome");
else
System.out.println(str + "not a palindrome");
}

public static boolean ispal(String s) {
if(s.length() == 0 || s.length() == -1)
return true;
if(s.charAt(0)==s.charAt(s.length()-1))
return ispal(s.substring(1, s.length()-1));
return false;
}
}

