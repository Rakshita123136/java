import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardExample extends JFrame implements ActionListener {
    // Declare the object
    CardLayout card;
    // Declare JButton objects
    JButton b1, b2, b3;
    // Declare JFrame object
    JFrame f;

    CardExample() {
        f = new JFrame();
        card = new CardLayout(40, 30);
        f.setLayout(card);
        b1 = new JButton("Greeks");
        b2 = new JButton("FOR");
        b3 = new JButton("Greeks");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        f.add("a", b1);
        f.add("b", b2);
        f.add("c", b3);
        
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(f);
    }

    public static void main(String[] args) {
        new CardExample();
    }
}
