package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame f= new JFrame();
	JPanel p = new JPanel();
	
	JButton b = new JButton();
	JButton b2 = new JButton();
 void makeButtons(){
	f.add(p);
	p.add(b);
	p.add(b2);
	b.addActionListener(this);
	b2.addActionListener(this);
	f.setVisible(true);
	b.setText("joke");
	b2.setText("not joke");
	f.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()== b ) {
		JOptionPane.showConfirmDialog(null, "YOU");
	}
	if (e.getSource()== b2) {
		JOptionPane.showConfirmDialog(null, "NOT YOU");
	}
}
}

