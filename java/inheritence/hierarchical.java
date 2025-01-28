class a1{
public void set(){
 System.out.println("this is set of class a1");
}
}
class b1 extends a1{
    public void get(){
        System.out.println("this is get of class b1");
    }  
}
 class c1 extends a1 {
public void check(){
    System.out.println("this is check of class c1");
} 
}
public class hierarchical {
    public static void main(String[] args) {
        a1 A =  new a1();
        System.out.println("using object of base class A");
        A.set();
        b1 B = new b1();
        B.set();
        B.get();
        c1 C = new c1();
        System.out.println("using object of base class c");
        C.set();
        C.check();  
    }
}
