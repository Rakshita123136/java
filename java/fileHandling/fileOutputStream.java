
import java.io.FileOutputStream;
public class fileOutputStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\JYOTIKA\\Desktop\\testout.txt");
            fout.write('H');
            fout.close();
            System.out.println("success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
