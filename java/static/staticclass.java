class staticdemo {
    static int x = 0; // Static variable
    static int y = 5;

    public static void show() {
        System.out.println("Static data member x = " + x);
        System.out.println("Static data member y = " + y);
    }
}

public class staticclass {
   public static void main(String[] args) {
       System.out.println("Calling static member function show() of class staticdemo");
       
       // Correct way to call the static method
       staticdemo.show();
       
       System.out.println("Value of static data member x of class staticdemo: " + staticdemo.x);
       System.out.println("Value of static data member y of class staticdemo: " + staticdemo.y);
   } 
}
