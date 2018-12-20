public class ifelse{
public static void main(String[] args){
int a= 2;
int b= 2;
int c= 2;
if(a<b && a<c)
{
System.out.println("a is greater than b c i.e" +a);
} else if(b<a && b<c)
{
System.out.println("b is greater than a c i.e " +b);
} else if (c<a && c<b) {
System.out.println("c is greater than a b i.e" +c);
}
}
}