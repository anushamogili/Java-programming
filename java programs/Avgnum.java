import java.awt.*;
public class Avgnum
{
public static void main(String[] args){
double[] a = {1, 2, 3, 4, 5}; 
int i; 
double sum=0;
//for(i=0; i<a.length; i++){
for(double ele:a){
sum += ele;
//sum=sum+a[i];
}
System.out.format("sum of array %f ",sum);
double avg=sum/a.length;
System.out.format("avg number of %f", avg);
}
}