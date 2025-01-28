class final1 {
    public final1(){
        System.out.println("this is constructor");
    }
    protected void final3() throws Throwable{
        System.out.println("This is Finalizer");
    }
    public void set() {
        System.out.println("this is set method");
    }
}
public class Finalizer {
public static void main(String[] args) {
    System.out.println("main starts");
    final1 f1 = new final1();
    f1.set();
    System.out.println("main ends");
}
    
}