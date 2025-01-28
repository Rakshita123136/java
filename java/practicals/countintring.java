import java.io.*;
public class countintring 
{
public static void main(String args[]) throws IOException
{
String s;
int i,alpha=0,sp =0,num=0,sym=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a string");
s = br.readLine();
char arr[] = s.toCharArray();
for (i = 0 ; i < arr.length ;i++)
{
    if ((arr[i] >= 65 && arr[i]<=90 || arr[i]>= 97 && arr[i]<= 122))
    {
    alpha++;
}
if(arr[i]== 32)
{
    sp++;
}
if(arr[i]>=48 && arr[i]<=57)
{
    num++;
}
if((arr[i]>=0 && arr[i]<=47)|| (arr[i]>58 && arr[i]<=64) || (arr[i]>= 91 && arr[i]<96)||(arr[i]>= 123 && arr[i]<=127))
{
    sym++;
}
}
System.out.println("total count of letter:" +alpha);
System.out.println("total count of space:" +sp);    
System.out.println("total count of numbers:" +num);    
System.out.println("total count of special symbol:" +sym);    
}
}