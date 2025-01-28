import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foodordercheckbox1 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Food Ordering System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create checkboxes
        JCheckBox pizza = new JCheckBox("Pizza @ 100");
        pizza.setBounds(50, 50, 150, 30);
        JCheckBox burger = new JCheckBox("Burger @ 30");
        burger.setBounds(50, 100, 150, 30);
        JCheckBox tea = new JCheckBox("Tea @ 10");
        tea.setBounds(50, 150, 150, 30);
        JCheckBox soup = new JCheckBox("Soup @ 90");
        soup.setBounds(50,200,150,30);
        // Add checkboxes to the frame
        frame.add(pizza);
        frame.add(burger);
        frame.add(tea);
        frame.add(soup);

        // Create an Order button
        JButton orderButton = new JButton("Order");
        orderButton.setBounds(50, 250, 80, 30);
        frame.add(orderButton);

        // Action Listener for the button
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                StringBuilder message = new StringBuilder();

                if (pizza.isSelected()) {
                    total += 100;
                    message.append("Pizza: 100\n");
                }
                if (burger.isSelected()) {
                    total += 30;
                    message.append("Burger: 30\n");
                }
                if (tea.isSelected()) {
                    total += 10;
                    message.append("Tea: 10\n");
                }
                
                if (soup.isSelected()) {
                    total += 90;
                    message.append("Soup: 90\n");
                }
                message.append("-----------------\n");
                message.append("Total: ").append(total);

                // Show the message in a dialog
                JOptionPane.showMessageDialog(frame, message.toString());
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}

