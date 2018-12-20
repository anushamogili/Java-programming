import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class factorial {

    public static void main(String[] args) {
int i;
    	System.out.print("Enter any number:");
        Scanner in=new Scanner(System.in);
        int  n = in.nextInt();
//int a[]= in.nextInt(n);
int facts = fact(n);
int entfacts = fact(n-1);
System.out.println("Factorial of enetered number "+n+" is " +facts);
System.out.println("Factorial of nearest number "+(n - 1)+" to enetered number "+n+" is " +entfacts);

    }

static int fact(int num)
{
int out;
if(num==0){
return 1;
}
out=fact(num-1)*num;
return out;
}

}