package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame f;
JPanel p;
JButton b;
JLabel s; 
JLabel a;
JLabel bar; 
SlotMachine(){
	try {
		a = createLabelImage("apple.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		s = createLabelImage("7.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		bar = createLabelImage("bar.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void run() {
	f = new JFrame();
	p= new JPanel();
	b=new JButton();
	f.add(p);
	p.add(b);
	b.setText("SPIN");
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	b.addActionListener(this);
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
