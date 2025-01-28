package DESERIALIZTION;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

class student implements Serializable {  // Implement Serializable interface
    private static final long serialVersionUID = 1L;  // Optional, for version control
    int stuRollNo;
    String stuName;
}

public class Serialization {
    public static void main(String[] args) {
        student s1 = new student();
        s1.stuRollNo = 5;
        s1.stuName = "pradeep";
        String fileName = "C:\\Users\\JYOTIKA\\Desktop\\TestFile.txt";
        
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object saved in file");
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
/*the output of the code is 
 * object saved in file
 */