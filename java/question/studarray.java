/*define a class student with data member roll no,marks,name with data member accept data for 5 object using array of object
 and print it*/

import java.util.*;

class Student {
    String name;
    int rno, marks;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter rno, name, and marks:");
        rno = sc.nextInt();
        name = sc.next();
        marks = sc.nextInt();
    }

    void disp() {
        System.out.println("Roll no: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class studarray {
    public static void main(String[] args) {
        int i;
        Student[] obj = new Student[5];

        // Initialize the student objects in the array
        for (i = 0; i < 5; i++) {
            obj[i] = new Student();  // No semicolon here
        }

        // Get data and display for each student
        for (i = 0; i < 5; i++) {
            obj[i].getdata();
            obj[i].disp();
        }
    }
}
