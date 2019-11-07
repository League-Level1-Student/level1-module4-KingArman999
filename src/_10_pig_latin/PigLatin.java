package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JButton b = new JButton();
void run(){
	b.addActionListener(this);
		b.setText("translate");
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	String s = t1.getText();
	translate( s );
	
	}





}

