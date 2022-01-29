import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author junti
 *
 */
public class Frame extends JFrame{

	//boolean upPressed, downPressed, leftPressed, rightPressed;
	
	
	Frame(){
	//ImageIcon image = new ImageIcon("Little.jpg");
	//panel = new Panel();
	Panel panel = new Panel();
	
	this.add(panel);
//	panel.run();
	panel.startThread();
	this.setSize(900, 500);
	this.getContentPane().setBackground(Color.white);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Title");
	//this.setLayout(null);
	this.pack();
	this.setVisible(true);
	this.setLocationRelativeTo(null);
	
	}
	
	
//	public void start() {
//		start = true;
//		//newOpp();
//	}
//	


	
//	public void newOpp(){
//		random = new Random();
//		while (start && alive) {
//			this.add(opps);
//			oppsX  = random.nextInt((430) +50);
//		}
//	}

	
//
//	@Override
//	public void actionPerformed1(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void keyPressed(KeyEvent e) {
//		// TODO Auto-generated method stub
//		int code = e.getKeyCode();
//		if (code == KeyEvent.VK_W) {
//			upPressed = true;
//	}
//		if (code == KeyEvent.VK_A) {
//			leftPressed = true;
//		}
//		if (code == KeyEvent.VK_S) {
//			downPressed = true;
//		}
//		if (code == KeyEvent.VK_D) {
//			rightPressed = true;
//		}
//	
//		switch (e.getKeyChar()){
//		case 'w' : dot.setLocation(dotX, dotY - 9);
//		break;
//		case 's' : dot.setLocation(dotX, dotY+9);
//		break;
//		case 'a' : dot.setLocation(dotX-9, dotY);
//		break;
//		case 'd' : dot.setLocation(dotX+9, dotY);
//		break;}
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		int code = e.getKeyCode();
//		
//		if (code == KeyEvent.VK_W) {
//			upPressed = false;
//		}
//		if (code == KeyEvent.VK_A) {
//			leftPressed = false;
//		}
//		if (code == KeyEvent.VK_S) {
//						downPressed = false;
//		}
//		}
//		if (code == KeyEvent.VK_D) {
//			rightPressed = false;
//	}
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		start = true;
//		repaint();
//		
//	}
}

