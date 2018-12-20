public class com{
public static void main(String[] args){
int p1=1;
int p2=2;
int p3=3;
int p4=4;
int p5=5;
int high = p1;
int sec= 0;
if(high<p2)
{
sec = high; //s=p1
high = p2; //h=2
}
if(high<p3)
{
sec = high;//s=2
high = p3; //h=3
}
if(high<p4)
{
sec = high;
high = p4;
}
if(high<p5)
{
sec = high; //s=4
high = p5; //h=5
}
System.out.println(high);
if(sec != high)
{
System.out.println(sec);
}
}
}