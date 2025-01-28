public class StaticMethod {
    public static void main(String[] args) {
        int a = 10, b = 5;
        StaticMethod.add(a, b); // Call the static method 'add'
    }
    public static void add(int x, int y) {
        int z = x + y;
        System.out.println("Addition = " + z);
    }
}
/*
 * this is output 
 * Addition = 15
 */