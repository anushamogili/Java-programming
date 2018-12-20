import java.awt.*;
import java.util.Scanner;

class linear {

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
for( i=0;i<a.length;i++){

//for( int j=0;j<a.length-1;j++){
if(a[i]==search)
{
System.out.println(search+ "found" +a[i+1]);
break;
}

}
if(i==num)

System.out.println(search + "doesnt exist in array");
//for(i=0;i<a.length;i++){
//System.out.println(a[i]);
//}

}
}