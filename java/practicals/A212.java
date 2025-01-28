//use bubble sort technique to sort
import java.io.*;
public class A212
{
    public static void main(String[] args) throws IOException
     {
        SortData s = new SortData();
        s.acceptData();

        s.asec();
        System.out.println("After sorting in ascending order:");
        s.showData();

        s.desc();
        System.out.println("After sorting in descending order:");
        s.showData();
    }
}

class SortData
 {
    int[] a = new int[10];

    public void acceptData() throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 array elements:");
        for (int i = 0; i < 10; i++)
         {
            a[i] = Integer.parseInt(br.readLine());
        }
    }

    public void asec() 
    {
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 9 - i; j++)
             {
                if (a[j] > a[j + 1])
                 {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    public void desc() {
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 9 - i; j++)
             {
                if (a[j] < a[j + 1])
                 {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    public void showData() 
    {
        System.out.println("Sorted elements:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(a[i]);
        }
    }
}
