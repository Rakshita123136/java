import java.io.*;

public class buffer {
    public static void main(String[] args) {
        try {
            // Open a FileInputStream to read bytes from the specified file
            FileInputStream fin = new FileInputStream("C:\\Users\\JYOTIKA\\Desktop\\textdoc.txt");
            
            // Wrap the FileInputStream with a BufferedInputStream for efficient reading
            BufferedInputStream bin = new BufferedInputStream(fin);
            
            int i;
            // Read bytes one at a time until the end of the file is reached
            while ((i = bin.read()) != -1) {
                // Cast the byte to a character and print it
                System.out.print((char) i);
            }
            
            // Close the streams to release system resources
            bin.close();
            fin.close();
        } catch (Exception e) {
            // Print any exceptions that occur during file reading
            System.out.println(e);
        }
    }
}

