
import java.io.FileInputStream;
public class fileinputStreamexample1 {
    public static void main(String[] args) {
        
            try{
                FileInputStream fin = new FileInputStream("C:\\Users\\JYOTIKA\\Desktop\\testout.txt");
                int i = 0;
                while((i = fin.read())!=-1){
                    System.out.println((char)i);
                }
            }catch(Exception e){
                System.out.println(e);
            }
    }
}
