/*define a class item having data member code and price accept data for one obj and dis*/
import java.util.*;

class Innerpriceitem {
 String code;
 int price;
 Scanner sc = new Scanner(System.in);
 void getdata() {
    System.out.println("Enter code");
    code = sc.next();
    System.out.println("Enter price");
    price = sc.nextInt();
 }
    void disp(){
        System.out.println("Code " +code);
        System.out.println("Price " +price);
    }
}
public class priceitem {
    public static void main(String[] args) {
    Innerpriceitem obj = new Innerpriceitem();
    obj.getdata();
    obj.disp();
    }
}
/* the output will be 
Enter code
67xysj347hdb
Enter price
780
Code 67xysj347hdb
Price 780
 */