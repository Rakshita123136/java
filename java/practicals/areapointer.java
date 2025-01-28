import java.io.*;
public class areapointer
 {
    public static void main(String[] args) throws IOException
    {
        double radius , area , perimeter;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter radius of circle");
        radius = Double.parseDouble(br.readLine());
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
        System.out.println("Area of circle is :" + area);
        System.out.println("Perimeter of circle is : " +perimeter);
    }
}
