//journal-2 write a java program to display image on a button 
import java.awt.*;
import javax.swing.*;
public class newimg1 {
 newimg1()
 {
	 JFrame f = new JFrame("button example");
	 ImageIcon m = new ImageIcon("C:\\Users\\JYOTIKA\\eclipse-workspace\\advjava\\src\\imageicon\\image.png");
	 JButton b = new JButton("Hello",m);
	 b.setFont(new Font("Arial",Font.PLAIN,40));
	 b.setVerticalTextPosition(SwingConstants.BOTTOM);
	 b.setHorizontalTextPosition(SwingConstants.CENTER);
	 b.setBounds(100,30,250,100);
	 f.add(b);
	 f.setSize(300,300);
	 f.setLayout(null);
	 f.setVisible(true);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 }
 public static void main(String[]args) {
	 new newimg1();
 }
}