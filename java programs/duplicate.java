import java.awt.*;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

//import java.net.InetAddress;
public class duplicate{

public void countDupChars(String str){
Map<Character, Integer> map = new HashMap<Character, Integer>();
char[] chars = str.toCharArray();
for(Character ch:chars){
if(map.containsKey(ch)){
map.put(ch, map.get(ch)+1);
}
else{
map.put(ch, 1);
}
}
Set<Character> keys = map.keySet();
for(Character ch:keys){
if(map.get(ch)>1){
System.out.println("char "+ch+" "+map.get(ch));
}
}
}
public static void main(String a[]){
duplicate obj = new duplicate();
System.out.println("String: BeginnersBook.com");
obj.countDupChars("anushaanushaanushamogili");
}
}

