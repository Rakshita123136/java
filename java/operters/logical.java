package operters;

public class logical {
    public static void main(String[] args) {
        int a = 10, b= 20;
        float c = 12.5f;
        double d = 10.43;
        //this is logical operator
        System.out.println("(a > b) && (b > c)=" +((a > b) && (b > c)));
        System.out.println("(a != d ) || (b >= c)=" +((a != d) || (b >= c)));
        System.out.println(" ! (a > b) =" +(!(a > b)));
    }
}
/*this is output of this code
* (a > b) && (b > c)=false
*(a != d ) || (b >= c)=true
*! (a > b) =true
 */