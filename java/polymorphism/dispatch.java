package polymorphism;
class A1{
    void callme(){
        System.out.println("Inside A1's method");
    }
}
class A2 extends A1{
    void callme(){
        System.out.println("inside A2's method ");
    }
}
class A3 extends A1{
    void callme(){
        System.out.println("inside A3's method ");
    }
}
public class dispatch {
    public static void main(String[] args) {
        A1 a = new A1();
        A2 b = new A2();
        A3 c = new A3();
         A1 r;
         r = a;
         r.callme();
         r = b;
         r.callme();
         r = c;
         r.callme();
    }
}
