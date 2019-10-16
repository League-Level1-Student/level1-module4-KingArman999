package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
JFrame f = new JFrame();
JPanel p = new JPanel();
JLabel l = new JLabel();
char currentLetter;
void TypeorDie(){
f.add(p);
f.pack();
f.setVisible(true);
currentLetter = generateRandomLetter();
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
}

