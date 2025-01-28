package polymorphism;
class add{
    public void getresult(int a , int b){
        System.out.println("Sum of " +a+ "and" +b+ "is" +(a+b));
    }
}
class multiply extends add{
    public void getresult(int a, int b){
        System.out.println("Mul of " +a+ " and "+b+ "is"  +(a*b));
    }
}
class divide extends multiply {
    public void getresult(int a , int b){
        System.out.println("Division of " +a+ " and" +b+ "  is "  +(a/b));
    } 
}
public class overridding {
    public static void main(String[] args) {
        divide d = new divide();
        multiply m = new multiply();
        add a = new add();
        a.getresult(12, 4);
        m.getresult(12,4);
        d.getresult(12, 4);
    }
}
