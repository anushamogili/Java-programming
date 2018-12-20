import java.awt.*;
import java.util.Scanner;

class swap {

    public static void main(String[] args) {

int i=0;
        Scanner scan=new Scanner(System.in);
System.out.print("Enter no of elements in array:");
int  num = scan.nextInt();
int []a=new int[num];
System.out.println("enter" +num+ "integrs:");
for(i=0;i<num;i++)
{
a[i]=scan.nextInt();
}
      

for( i=0;i<a.length;i++){

for( int j=0;j<a.length-1;j++){
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<a.length;i++){
System.out.println(a[i]);
}

}
}