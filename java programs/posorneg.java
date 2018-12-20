import java.util.Scanner;

public class posorneg
{
    public static void main(String args[])
    {
        int  i;
        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter 5  Numbers : ");
        for(i=0; i<5; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0; i<5; i++)
        {
            if(arr[i] > 0)
            {
System.out.print( "\n" + arr[i] + " Positive Numbers");
                
            }
            else if(arr[i] < 0)
            {
System.out.print("\n" + arr[i] + " Negative Numbers");
               
            }
            else
            {
System.out.print("\n" + arr[i] + " neither");
              
            }
        }
	
    }
}