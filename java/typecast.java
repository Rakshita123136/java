public class typecast {
    public static void main(String[] args) {
        double a = 15.20;
        int x = (int) a;
        System.out.println("x = " +x);
        double y = (double) x;
        System.out.println("y= " +y);
        char s = 'a';
        int z = (int) s;
        System.out.println("z =" +z);
    }
}
/*
 * this is the output
 * x = 15
 *y= 15.0
 *z =97
 */