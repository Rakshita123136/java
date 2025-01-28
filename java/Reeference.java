public class Reeference {
    public static void main(String[] args) {
        InnerReeference ref1, ref2;
        final InnerReeference ref3;

        // Instantiate the inner class with appropriate constructor
        ref1 = new InnerReeference("this is first reference variable", 1);
        int number = ref1.getNumber();
        System.out.println("number = " + number);

        ref2 = new InnerReeference("this is the second reference variable", 2);
        Reeference.printText(ref2);

        // Initialize final variable
        ref3 = new InnerReeference("this is the third reference variable", 3);
    }

    // Updated printText method to accept an InnerReeference instance
    public static void printText(InnerReeference reeference) {
        String text = reeference.getText();
        System.out.println(text);
    }

    // Static inner class definition
    static class InnerReeference {
        private int number;
        private String text;

        // Constructor for InnerReeference class
        InnerReeference(String text, int number) {
            this.text = text;
            this.number = number;
        }

        // Getter methods
        public String getText() {
            return text;
        }

        public int getNumber() {
            return number;
        }
    }
}
/*this is output
 * number = 1
 * this is the second reference variable
 */
