import java.awt.*;
public class Evenodd{
public static void main(String[] args){
int i;
int remainder, a=22;
if(a%2==0)
{
System.out.println( a + " number is even no");
}
else{
System.out.println(" is odd no" + a);
}
for(i=0; i<10; i++){
remainder = i%2;
if(remainder == 0)
{
System.out.println( i + " number is even no");
}
else{
System.out.println(" is odd no" + i);
}
}
}
}