package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JLabel l = new JLabel();
char currentLetter;
void run(){
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p.add(l);
f.add(p);
f.addKeyListener(this);
currentLetter = generateRandomLetter();
l.setText(String.valueOf(currentLetter));
p.addKeyListener(this);
l.setFont(l.getFont().deriveFont(28.0f));
l.setHorizontalAlignment(JLabel.CENTER);
f.pack();
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (currentLetter==e.getKeyChar()) {
		System.out.println("correct");
		f.setBackground(Color.GREEN);
	} else 
	System.out.println("incorrect");
	System.out.println("you pressed: " + e.getKeyChar());
	f.setBackground(Color.RED);
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
currentLetter = generateRandomLetter();	
l.setText(String.valueOf(currentLetter));

}
}

