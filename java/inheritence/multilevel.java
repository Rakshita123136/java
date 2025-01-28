class A {
public void set(){
    System.out.println("this is set of class A");
}
}
class B extends A{
    public void get(){
        System.out.println("this is get of class B");
    }
}
class C extends B{
    public void check(){
        System.out.println("This is check of class C");
    }
}
public class multilevel {
    public static void main(String[] args) {
        A al = new A();
        System.out.println("using object of base class A ");
        al.set();
        B bl = new B();
        System.out.println("using object of base class B");
        bl.set();
        bl.get();
        C cl = new C();
        System.out.println("using object of base class c");
        cl.set();
        cl.get();
        cl.check();

    }
}
/**
 * using object of base class A 
this is set of class A
using object of base class B
this is set of class A
this is get of class B
using object of base class c
this is set of class A
this is get of class B
Thi is check of class C
 */