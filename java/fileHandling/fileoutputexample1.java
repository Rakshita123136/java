
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class fileoutputexample1 {
   public static void main(String[] args) {
    try{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\JYOTIKA\\Desktop\\testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s ="Welcome to java filehandling";
        byte b [] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success...");
    }catch(Exception e){
        System.out.println(e);
    }
   } 
}
