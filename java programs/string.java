import java.awt.*;
import java.util.Scanner;
import java.lang.String;
import java.lang.Object;
import java.lang.*; 
import java.io.*; 
import java.util.*;
public class string{
public static void main(String[] args) {
String str = ("anusha");
byte [] arr = str.getBytes();
byte [] result = new byte[arr.length];
for(int i=0;i<arr.length;i++)
result[i]=arr[arr.length-i-1];
System.out.println(new String(result));

StringBuilder inp = new StringBuilder();
inp.append(str);
inp = inp.reverse();
System.out.println(inp);

char[] anu = str.toCharArray();
for (int j = anu.length-1;  j>=0; j--){
System.out.println(anu[j]);
}

char[] temp = str.toCharArray();
int left right=0;
right = temp.length-1;
for (left=0; left < right; left++; right--)
char fine = temp[left];
temp[left] = temp[right];
temp[right]=temp;

 for( char c : temp)
system.out.print(c);
system.out.println();



}
}
