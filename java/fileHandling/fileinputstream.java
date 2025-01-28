
import java.io.FileInputStream;
public class fileinputstream {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\JYOTIKA\\Desktop\\testout.txt");
            int  i = fin.read();
            System.out.println((char)i);
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
