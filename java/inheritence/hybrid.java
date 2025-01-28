 class HYb1 {
 public void set() {
    System.out.println("this is set of class HYB1");
 } 
}
class HYB2 extends HYb1{
 public void get(){
   System.out.println("this is get of class HYB2");
 }   
}
class HYB3 extends HYB2 {
   public void check(){
      System.out.println("this is check of class HYB3");
   }
}
 class HYB4 extends HYB3 {
   public void put(){
      System.out.println("this is put of class HYB4");
   } 
}
public class hybrid {
    public static void main(String[] args) {
      HYb1 H1 = new HYb1();
      System.out.println("using object of base class HYB1");
      H1.set();
      HYB2 H2 = new HYB2();
      System.out.println("using object of base class HYB2");
      H2.set();
      H2.get();
      HYB3 H3 = new HYB3();
      System.out.println("Using object of base class HYB3");
      H3.set();
      H3.get();
      H3.check();
      HYB4 H4 = new HYB4();
      System.out.println("using object of base class HYB4");
      H4.set();
      H4.get();
      H4.check();
    }
}
