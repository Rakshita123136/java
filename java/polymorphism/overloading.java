package polymorphism;
class overload {
    public void  method(){
        System.out.println("This is without parameter");
    }
    public void method(int x){
        System.out.println("This is with integer parameter" +x);
    }
    public void method(Float y){
        System.out.println("This is with float parameter " +y);
    }
    public void  method(String m){
        System.out.println("This is with string parameter " +m);
    }
}
public class overloading {
    public static void main(String[] args) {
       overload ol = new overload();
       ol.method();
       ol.method(5);
       ol.method(16.34f);
       ol.method("hello");
    }
}
