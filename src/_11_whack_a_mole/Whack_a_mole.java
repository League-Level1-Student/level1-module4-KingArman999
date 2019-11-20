package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener {
JFrame f; 
JPanel p; 
int ran; 
int molesWhacked = 0;
int missed = 0;
Date timeAtStart = new Date();
void run() {
p = new JPanel();
f = new JFrame();
p.setLayout(new GridLayout(8,3));
	f.add(p);
f.setSize(300, 500);
f.setVisible(true);
drawbuttons();
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.pack();
}



void drawbuttons() {
	ran = new Random().nextInt(23);
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
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b2 = (JButton)e.getSource();
	System.out.println(b2.getText());
	if (b2.getText().equals("MOLE")){
		speak("Right");
		molesWhacked += 1;
	}else {
	speak("Wrong");
	missed += 1;
	JOptionPane.showMessageDialog(null, "You can do better!");
	}
	f.dispose();
	run();
	if (molesWhacked == 10) {
		endGame(timeAtStart, molesWhacked);
		JOptionPane.showMessageDialog(null, "You win");
		System.exit(0);
	}
	if (missed == 5) {
		speak("YOU LOSE TRY AGAIN NEXT TIME!");
		System.exit(0);
	}
}
}

