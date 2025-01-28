package CONSTRUCTION;

class Demo {
    public int a, b;

    public void display() {
        System.out.println("a = " + a + " and b = " + b);
    }
}

public class DefaultExample {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.display();
        d2.display();
    }
}

