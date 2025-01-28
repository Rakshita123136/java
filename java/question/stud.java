//create a class student having method get marks nd dispay. the getmark should accept roll no,name , marks of student nd dispay should print the same
import java.util.*;

class stud22 {
   String name;
   int rno , marks;
   Scanner sc = new Scanner(System.in);
   void getdata() {
      System.out.println("Enter rno");
      rno = sc.nextInt();
      System.out.println("Enter name");
      name = sc.next();
      System.out.println("Enter marks");
      marks = sc.nextInt();
   }
    void disp(){
      System.out.println("ROLL NO :" +rno );
      System.out.println("NAME :" +name );
      System.out.println("MARKS :" +marks );
    }
}
public class stud {
   public static void main(String[] args) {
      stud22 s = new stud22();
     s.getdata();
     s.disp();
   } 
}
/*the outpt will be 
Enter rno
45
Enter name
xyz
Enter marks
98
ROLL NO :45
NAME :xyz
MARKS :98
 */