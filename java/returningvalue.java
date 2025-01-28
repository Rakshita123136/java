public class returningvalue {
    public static void main(String[] args) {
        int a = 10, b = 5;
        returningvalue r = new returningvalue();
        int result = r.add(a, b); // Call with two parameters
        System.out.println("Addition = " + result);
    }

    // The add method now takes two parameters
    public int add(int x, int y) {
        int z = x + y; // Perform addition
        return z; // Return the result
    }
}

/*
 * Addition = 15
 */