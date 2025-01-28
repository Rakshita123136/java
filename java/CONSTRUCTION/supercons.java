package CONSTRUCTION;
class A {
 public A(int x){
    System.out.println("Received" +x+ "from the derived class");
 }  
}
class B extends A {
    public B() {
        super(4);
        System.out.println("printing for derived class");
    }
}
public class supercons{
    public static void main(String [] args){
        System.out.println("calling to constructor of derived class");
        B b1 = new B();
        System.out.println("printing from derived class");
    }
}
