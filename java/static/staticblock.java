public class staticblock {
    static int x;
    static int y = 5;
    
    static {
        System.out.println("Static block is executing and initializing static x as 10");
        System.out.println("x = " + x); // x is 0 by default since it’s not initialized
        System.out.println("y = " + y); // y is 5 because it's initialized
    }
    
    public static void main(String[] args) {
        // The static block will run before this point.
    }
}

