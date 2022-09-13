import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements KeyListener, ActionListener{
	
	// instance variables - "global" variables

	public void paint(Graphics g) {
		super.paintComponent(g);
	}
	
	
	
	public Frame() {
		//name of the title bar of the GUI
		JFrame f = new JFrame("Pong");
		
		//makes sure program stops when	closed
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //dont delete
		
		f.setSize(800,600); //width and height-- GUI dimensions
		f.add(this);
		f.addKeyListener(this);
		
		t = new Timer(16, this); //animation timer
		t.start();
		f.setVisible(true);
		
	}
	
	
	
	
	Timer t;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
