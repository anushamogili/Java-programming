javaimport java.awt.*;
import java.util.Scanner;
public class opp{
public static void main(String[] args) {
for(int i=0; i<4; i++){
for(int j=0; j<10; j++){
if(i==0)
{
if(j==5)
System.out.println("a" +i +j);
else
System.out.print("" +i +j);
}
else if(i==1)
{
if(j==3)
System.out.println("n" + i  + j);
else if(j==7)
System.out.println("u" + i  + j);
else 
System.out.print("" + i  + j);
}
else if(i==2)
{
if(j==1)
System.out.println("s" + i  + j);
else if(j==9)
System.out.println("h" + i  + j);
else
System.out.print("" + i  + j);
}
else if(i==3)
{
if(j==5)
System.out.println("a" + i  + j);
else
System.out.print("" + i  + j);
}
//else
//System.out.print("" + i);
}
//System.out.println("" + i);
}
}
}