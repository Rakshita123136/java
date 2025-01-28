// Implementation of abstract class
abstract class A {
    // Abstract method
    abstract void set(int x);

    // Normal method
    void get() {
        System.out.println("This is a normal method of abstract class A");
    }
}

// Class B extending abstract class A
class B extends A {
    // Overriding the abstract method
    @Override
    void set(int x) {
        System.out.println("Abstract method is overridden in derived class with value: " + x);
    }

    // Normal method in class B
    void check() {
        System.out.println("This is a normal method of derived class B");
    }
}

// Main class
public class abstractclassdemo {
    public static void main(String[] args)
     {
        B b1 = new B();
        b1.get();     // Calls the normal method from class A
        b1.set(4);    // Calls the overridden method from class B
        b1.check();   // Calls the normal method from class B
    }
}
//for output 

// PS C:\Users\JYOTIKA\OneDrive\Desktop\java\practicals> javac abstractclassdemo.java 
// PS C:\Users\JYOTIKA\OneDrive\Desktop\java\practicals> 
// PS C:\Users\JYOTIKA\OneDrive\Desktop\java\practicals> java abstractclassdemo
// This is a normal method of abstract class A
// Abstract method is overridden in derived class with value: 4
// This is a normal method of derived class B
