package operters;

public class bitwise {
    public static void main(String[] args) {
        int a= 10, b = 20;
        System.out.println("(a&b)= " +(a & b));
        System.out.println("(a|b)= " +(a | b));
        System.out.println("(a^b=" +(a ^ b));
        System.out.println("(a>=b)= " +(a >= b));
        System.out.println("(a<=b)=" +(a <= b));
        System.out.println("5 & 4 =" +(5 & 4));
        System.out.println("5 | 4=" +(5 | 4));
        System.out.println("5 >> 2" +(5>>2));
        System.out.println("5<<2" +(5<<2));
    }
}
/*
(a&b)= 0
(a|b)= 30
(a^b=30
(a>=b)= false
(a<=b)=true
5 & 4 =4
5 | 4=5
5 >> 21
5<<220
 */