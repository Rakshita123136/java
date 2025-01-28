//find largest and smallest element in array
import java.io.*;
public class arrayoperation 
{
public static void main(String args[]) throws IOException
{
 int a[] = new int[15];
 int largest,smallest;
 int i;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 15 elements");
for(i = 0; i <= 14 ; i++)
{
    a[i] = Integer.parseInt(br.readLine());
}
largest = a[0];
smallest = a[0];
for(i = 0; i <= 14; i++)
{
if(a[i]> largest){
    largest = a[i];
}
if(a[i] < smallest) {
    smallest = a[i];
}
}
System.out.println("smallest element is :" + smallest);
System.out.println("Largest element is :" +largest);
}
}
