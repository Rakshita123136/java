 //write a code which explain the scope of variable
 public class scopeofvariable {

    // Static variable, shared by all instances of the class
    static int x = 11;
    
    // Instance variable, each object of the class has its own copy
    private int y = 33;

    // Method with a parameter named 'x', which shadows the class-level static variable 'x'
    public void method1(int x) {
        // Create a new instance of scopeofvariable, named 'v'
        scopeofvariable v = new scopeofvariable();

        // 'this.x' refers to the static variable 'x' from the class, not the method parameter
        this.x = 22; // This modifies the static variable 'x' for the class, changing it to 22

        // 'y' refers to the instance variable 'y' of this object (current object)
        y = 44; // This modifies the instance variable 'y' for the current object to 44

        // Accessing the static variable 'x' from the class, which has been updated to 22
        System.out.println("scopeofvariable.x: " + scopeofvariable.x);

        // Accessing 'x' of the new object 'v', which points to the same static variable (22)
        System.out.println("v.x: " + v.x);

        // Accessing 'y' of the new object 'v', which still has its original value (33)
        System.out.println("v.y: " + v.y);

        // Accessing the instance variable 'y' of the current object (which was updated to 44)
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        // Create an instance of scopeofvariable
        scopeofvariable v = new scopeofvariable();
        
        // Call method1 with the value 5 (but this does not affect the static x)
        v.method1(5);
    }
}

/*
 * this is output
 * v.x: 22
 *v.y 33
 *y : 44
 */