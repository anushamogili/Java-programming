import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class factorial {

    public static void main(String[] args) {
int n,i;
    	System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        int  n = in.nextInt();
//int a[]= in.nextInt(n);
int facts = fact(n);
System.out.println("Factorial of enetered number is " +facts);

    }

static int fact(int num)
{
int out;
if(n==1){
return 1;
}
out=fact(n-1)*n;
return out;
}

}