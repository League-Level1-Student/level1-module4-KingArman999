package _08_calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	int num1;
	int num2;
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(10);

	void run() {
		f.add(p);
		p.add(t1);
		p.add(t2);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(l);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b1.setText("Add");
		b2.setText("Sub");
		b3.setText("Mul");
		b4.setText("Div");
		f.setVisible(true);
		f.pack();
		l.setText("  ");
	}

	void add(){
	String numb1 = t1.getText();
	int num1 = Integer.parseInt(numb1);
	String numb2 = t2.getText();
	int num2 = Integer.parseInt(numb2);
	l.setText(String.valueOf(num1+num2));
	}

	void subtract() {
		String numb1 = t1.getText();
		int num1 = Integer.parseInt(numb1);
		String numb2 = t2.getText();
		int num2 = Integer.parseInt(numb2);
		l.setText(String.valueOf(num1-num2));
	}

	void multiply() {
		String numb1 = t1.getText();
		int num1 = Integer.parseInt(numb1);
		String numb2 = t2.getText();
		int num2 = Integer.parseInt(numb2);
		l.setText(String.valueOf(num1*num2));
	}

	void divide() {
		String numb1 = t1.getText();
		int num1 = Integer.parseInt(numb1);
		String numb2 = t2.getText();
		int num2 = Integer.parseInt(numb2);
		l.setText(String.valueOf(num1/num2));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
