class a {
    public int i,j;
    public void showbase(){
        System.out.println("i and j of base class are "+i+ "and" +j);
    }
}
class b extends a {
public int k;
public void showderiverd(){
    System.out.println("K of derived class is "  +k);
}
 public void addall(){
    System.out.println("i + j + k" +(i+j+k));
 }   
}
public class single {
    public static void main(String[] args) {
        a al = new a();
        b bl = new b();
        System.out.println("using object of base class");
        al.i = 4;
        bl.j = 6;
        al.showbase();
        System.out.println("using object of derived class");
        bl.i =10;
        bl.j = 11;
        bl.k = 12;
        bl.showbase();
        bl.showderiverd();
        System.out.println("system addition of all");
        bl.addall();
    }
}
