class instanceMethod {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int z = a + b;

        // Create an instance of the class to call the instance method
        instanceMethod i = new instanceMethod();
        i.add(a, b, z); // Pass z as an argument
    }

    // Instance method is now declared at the class level
    public void add(int a, int b, int z) {
        System.out.println("Addition = " + z);
    }
}
/*the out put is
 * Addition = 15
 */