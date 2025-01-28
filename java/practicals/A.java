class A {
    public static void main(String[] args) {
        String str = "67281";
        char array[] = str.toCharArray();
        long s = SumOfDigits.sumOfDigits(array);
        System.out.println("Sum of digits is: " + s);
    }
}

class SumOfDigits {
    public static long sumOfDigits(char arr[]) {
        long sum = 0;
        int n;

        for (int i = 0; i < arr.length; i++) { // Corrected condition in the loop
            n = Character.getNumericValue(arr[i]); // Convert character to its numeric value
            sum += n; // Add numeric value to sum
        }
        
        return sum;
    }
}
