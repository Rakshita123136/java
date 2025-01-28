class base {
    public void set(){
        System.out.println("this set()  method of base class");
    }
    public void get(){
        System.out.println("this get() method of base class");
    }
}
class derived extends base{
    public void check(){
        System.out.println("This demo() method of derived class");
    }
    public void demo(){
        System.out.println("This demo() method of derived class");
    }
}
public class inheritancedemo {
    public static void main(String [] args){
        System.out.println("main start");
        derived d = new derived();
        d.set();
        d.get();
        d.check();
        d.demo();
        System.out.println("main ends");
    }
}
