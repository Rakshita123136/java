package CONSTRUCTION;

class cons1 {
    public int a, b;

    // Parameterized constructor
    public cons1(int a, int b) {
        System.out.println("Inside parameterized constructor");
        this.a = a;  // Correct assignment to instance variable
        this.b = b;  // Correct assignment to instance variable
    }

    // Method to display values of a and b
    public void display() {
        System.out.println("a = " + a + " and b = " + b);
    }
}

public class parameter {
    public static void main(String[] args) {
        cons1 c1 = new cons1(10, 4);  // Corrected the leading zero in 04
        cons1 c2 = new cons1(0, 0);   // Replaced cons2 with cons1

        c1.display();
        c2.display();
    }
}
/**output of the code
 Inside parameterized constructor
Inside parameterized constructor
a = 10 and b = 4
a = 0 and b = 0
 */