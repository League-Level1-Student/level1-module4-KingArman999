package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
int ran = new Random().nextInt(23);
void run() {
f.add(p);
f.setSize(50, 150);
f.setVisible(true);
drawbuttons();
}



void drawbuttons() {
	
for (int i = 0; i < 24; i++) {
	JButton b1 = new JButton();
		p.add(b1);
		b1.addActionListener(this);
	if (i == ran) {
		b1.setText("MOLE");
	}
		
	}
  }	

void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b2 = (JButton)e.getSource();
	System.out.println(b2.getText());
	if (b2.getText().equals("MOLE")){
		speak("Right");
		System.out.println("asd");
	}else {
	speak("Wrong");
	p.remove(f);
	drawbuttons();
	}			
}
}

