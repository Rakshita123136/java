//tables that takes a number as input and print its multiplication table upto 10
 import java.io.*;
 class tables
 {
    public static void main(String args[]) throws IOException //necessary because the BufferedReader class’s readLine() method can throw an IOException
    {
        int n , i , r;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //used for reading input from the console in Java
        System.out.println("enter a number");
        n = Integer.parseInt(br.readLine()); //used to read a line of text input from the user and then convert it into an integer value.
        for (i = 1; i<=10;i++)
        {
            r = n*i;
            System.out.println(n + "x" + i + "=" +r);

        }
    }
 }