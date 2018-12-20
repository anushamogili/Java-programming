import java.awt.*;
import java.util.Stack;
import java.util.*;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class stack{
public static void main(String[] args) {
//int number=1;
Scanner scanner= new Scanner(System.in);
System.out.println("Enter a string");
String str= scanner.nextLine();
Stack<String> spa = new Stack<>();
for(int i=0; i< str.length(); i++){
spa.push(str.charAt(i));
}
String reverseString = "";
while (!spa.isEmpty()) {
reverseString = reverseString+spa.pop();
}
if (str.equals(reverseString))
System.out.println("The input is a palindrome");
else
System.out.println("The input is not a palindrome");
}
}