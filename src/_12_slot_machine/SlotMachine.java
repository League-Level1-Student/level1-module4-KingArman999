package _12_slot_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class SlotMachine implements ActionListener {
JFrame f;
JPanel p;
JButton b;
Icon s; 
Icon a;
Icon bar; 
int winner = 0;
AudioClip sound;
JLabel j1 = new JLabel();
JLabel j2 = new JLabel();
JLabel j3 = new JLabel();
Random ran =new Random();

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
	f=new JFrame();
	p=new JPanel();
	b=new JButton();
	
	f.add(p);
	p.add(b);
	p.add(j1);
	p.add(j2);
	p.add(j3);
	b.setText("SPIN");
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	b.addActionListener(this);
	f.pack();
}
private Icon createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return null;
}
Icon icon = new ImageIcon(imageURL);
return icon;
}
public void playSound(String soundFile) {
	try {
	    sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		sound.play();
		Thread.sleep(3400);
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	playSound("4359__noisecollector__pongblipf4.wav");
	int r1 = ran.nextInt(3);
	if (r1 == 0) {
		j1.setIcon(a);
	} else if(r1 == 1) {
		j1.setIcon(s);
	} else if(r1 == 2) {
		j1.setIcon(bar);
	}
	int r2 = ran.nextInt(3);
	if (r2 == 0) {
		j2.setIcon(a);
	} else if(r2 == 1) {
		j2.setIcon(s);
	} else if(r2 == 2) {
		j2.setIcon(bar);
	}
	int r3 = ran.nextInt(3);
	if (r3 == 0) {
		j3.setIcon(a);
	} else if(r3 == 1) {
		j3.setIcon(s);
	} else if(r3 == 2) {
		j3.setIcon(bar);
	}
	if (r1 == r2&& r2==r3) {
		JOptionPane.showMessageDialog(null, "YOU WIN BIG");
		winner +=1;
		System.out.println("You have won "+ winner + " time(s)!");
		playSound("341871__edsward__ping.wav");
	}
	f.pack();
  }
}

