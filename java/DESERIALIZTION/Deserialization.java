package DESERIALIZTION;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class Deserialization {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\JYOTIKA\\Desktop\\TestFile.txt";
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            student obj = (student) ois.readObject();
            System.out.println(obj.stuRollNo);
            System.out.println(obj.stuName);
            fis.close();
            ois.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
// the output of the code is 
//5
//Pradeep