import java.io.*;

public class binarydecimal {
    public static void main(String[] args) throws IOException {
        int decimal_num, decimal;
        long binary_num;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Decimal to Binary Conversion
        System.out.println("Enter a decimal number:");
        decimal_num = Integer.parseInt(br.readLine());
        int[] binary = convertDecimalToBinary(decimal_num);

        System.out.println("Its equivalent binary number is:");
        for (int i = binary.length - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

        // Binary to Decimal Conversion
        System.out.println("\n\nEnter a binary number:");
        binary_num = Long.parseLong(br.readLine());
        decimal = convertBinaryToDecimal(binary_num);
        System.out.println("Its equivalent decimal number is: " + decimal);
    }

    // Method to convert decimal to binary
    public static int[] convertDecimalToBinary(int num) {
        int[] bin = new int[30];
        int i = 0;
        while (num > 0) {
            bin[i++] = num % 2;
            num = num / 2;
        }

        // Trim the binary array to the correct length
        int[] result = new int[i];
        System.arraycopy(bin, 0, result, 0, i);
        return result;
    }

    // Method to convert binary to decimal
    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            decimalNumber += (int) (remainder * Math.pow(2, i));
            ++i;
        }
        return decimalNumber;
    }
}