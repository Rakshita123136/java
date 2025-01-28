class base {
    public void demoMethod(){
        System.out.println("this is method of base class");
    }
}
class derived extends base {
    public void demoMethod(){
        System.out.println("this is overridden method of derived class");
    }
}
public class methodoverriding {
    public static void main(String[] args) 
    {
        System.out.println("main start");
        derived d = new derived();
        d.demoMethod();
        System.out.println("main ends");
    }
}
// for output 
// >> javac methodoverriding.java
// >> java methodoverriding
// >> 
// main start
// this is overridden method of derived class
// main ends