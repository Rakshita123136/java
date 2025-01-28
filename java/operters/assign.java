package operters;

public class assign {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int z = x++;
        int m = ++x;
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("x++ =" +z); //this is post increment
        System.out.println("++x " +m); //this is pre increment
        //this is assignment operator
        System.out.println("x += y =" +(x += y)); 
        System.out.println("x -= y =" +(x -= y));
        System.out.println("x*=y =" +(x *= y));
        System.out.println("x /= y =" +(x / y));
    }
}
/*this is the output
 * x = 12
y = 20
x++ =10
++x 12
x += y =32
x -= y =12
x*=y =240
x /= y =12
 */
