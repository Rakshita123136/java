// Base class A
class A {
    public void get() {
        System.out.println("This is get() method of class A");
    }

    public void demo() {
        System.out.println("This is demo() method of class A");
    }
}

// Interface B
interface B {
    void set();
    void demo(); 
}

// Derived class C
class C extends A implements B {
    public void put() {
        System.out.println("This is put() method of class C");
    }

    @Override
    public void set() {
        System.out.println("This is overridden set() method of interface B");
    }

    public void check() {
        System.out.println("This is check() method of class C");
    }
}

// Main class
public class multipleinheritance {
    public static void main(String[] args) {
        System.out.println("main starts");
        C c = new C();
        c.get();
        c.demo();   // Resolved by A's demo() method
        c.put();
        c.set();
        c.check();
        System.out.println("main ends");
    }
}
// for output 
// >>
// PS C:\Users\JYOTIKA\OneDrive\Desktop\java\practicals> javac multipleinheritance.java
// >>
// PS C:\Users\JYOTIKA\OneDrive\Desktop\java\practicals> java multipleinheritance
// >>
// main starts
// The is get() method of class A
// This is demo() method of class A
// This is put() method of class C
// This is overridden set() method of interface B
// this is overriden check() method of interface B
// main ends