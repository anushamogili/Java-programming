import java.awt.*;
import java.util.Scanner;

class binary {

    public static void main(String[] args) {

int i=0, temp=0;
        Scanner scan=new Scanner(System.in);
System.out.print("Enter no of elements in array:");
int  num = scan.nextInt();
int []a=new int[num];
System.out.println("enter" +num+ "integrs:");
for(i=0;i<num;i++)
{
a[i]=scan.nextInt();
}
      
System.out.println("enter no to search:");
int search =scan.nextInt();

int first=0;
int last=num-1;
int middle=first+last/2;
if(search<a[middle])
first=middle+1;
else if(a[middle]==item){
System.out.println("found:" +search +a[i+1]);
break;
else{
last=middle-1;
}

}
}