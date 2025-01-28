//use of constructor and destrutor
 import java.io.*;

class Finalizer
 {
    public Finalizer() 
    {
        System.out.println("Constructor executes");
    }

    // Corrected finalize method
    @Override
    protected void finalize() throws Throwable 
    {
        System.out.println("Finalize executes");
        super.finalize();  // Call superclass finalize
    }

    public void set() 
    {
        System.out.println("This is set method");
    }
}

public class A3 {
    public static void main(String[] args) {
        System.out.println("Main starts");
        
        Finalizer f1 = new Finalizer();
        f1.set();
        
        // Suggest garbage collection (not guaranteed)
        f1 = null;  // Make the object eligible for GC
        System.gc();  // Suggest JVM to run garbage collector

        System.out.println("Main ends");
    }
}
