import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame implements KeyListener{
	public static final int FRAME_WIDHT = 800;
	public static final int FRAME_HEIGHT = 600;
	
	public static final double SHIP_ACCELERATION = 2;
	public static final double SHIP_WIDTH = 40;
	public static final double SHIP_HEIGHT = 20;
	
	private boolean gameOver;
	private Ship playerShip;
	private JPanel display;
	
	public Game() {
		this.addKeyListener(this);
		gameOver = false;
		playerShip = new Ship(180, (FRAME_HEIGHT/2) - (SHIP_HEIGHT/2), SHIP_WIDTH, SHIP_HEIGHT);
		display = new Display(this);
		display.setPreferredSize(new Dimension(800, 600));
		
		setSize(FRAME_WIDHT, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.add(display);
		
		setVisible(true);
	}
	
	//Dessinne tout les GameObjects
	public void drawAll(Graphics2D gRaw) {
		playerShip.draw(gRaw);
	}
	
	public boolean isOver() {
		return gameOver;
	}
	
	public void setGameOver(boolean bool) {
		gameOver = bool;
	}
	
	public void updateAll() {
		playerShip.update();
	}
	
	
	//Partie controller
	@Override
	public void keyTyped(KeyEvent e) {
		
		if(e.getKeyChar() == 'd') {
			playerShip.impulseUp();
		} 
		
		if(e.getKeyChar() == 'c') {
			playerShip.impulseDown();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
