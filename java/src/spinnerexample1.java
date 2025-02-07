import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class spinnerexample1 extends JFrame implements ChangeListener
{
	JLabel label;
	spinnerexample1(){
		JFrame f = new JFrame("Spinner Example");
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(250,100);
		SpinnerModel value = new SpinnerNumberModel(5,0,10,1);//initial value,minimum value,maximum value,step respectively
		JSpinner spinner = new JSpinner(value);
		spinner.setBounds(100,100,50,30);
		f.add(spinner);
		f.add(label);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		spinner.addChangeListener(this);
}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("Value :" +((JSpinner)e.getSource()).getValue());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new spinnerexample1();
	}

}
