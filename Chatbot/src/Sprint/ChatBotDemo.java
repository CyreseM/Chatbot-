package Sprint;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {
	private JTextArea ca = new JTextArea();
	private JTextField cf = new JTextField();
	private JButton b = new JButton();
	private JLabel l = new JLabel();
	
	Chatbot(){
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.cyan);
		f.setTitle("Chatbot");
		f.add(ca);
		f.add(cf);
		ca.setSize(300, 310);
		ca.setLocation(1,1);
		ca.setBackground(Color.BLACK);
		cf.setSize(300, 20);
		cf.setLocation(1, 320);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(400, 20);
		b.setLocation(300, 320);
		
		b.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== b) {
					String text = cf.getText();
					ca.setForeground(Color.GREEN);
					ca.append("You -->"+ text + "\n"); 
					cf.setText("");
					
					if(text.contains("hi")) {
						replyMath("hi there");
					}
					else if(text.contains("how are you")) {
						replyMath("I'm Good :). Thank you for asking. What about you? ");
					}
					else if(text.contains("what is your name?")) {
						replyMath("I am Baewae");
					}
					else if(text.contains("gender?")) {
						replyMath("I am female. Don't fall in love :)");
					}
					else if(text.contains("bye")) {
						replyMath("Too soon? Okay stay safe.");
					}
					else {
						replyMath("I Can't Understand ");
					}
				}
			}
		});
		
	}
	public void replyMath(String s) {
		ca.append("ChatBot -->"+ s+ "\n");
	}
}

public class ChatBotDemo {

	public static void main(String[] args) {
		new Chatbot();
	}

}
