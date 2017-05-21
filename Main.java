import java.awt.Graphics2D;

import javax.swing.RepaintManager;

public class Main extends Thread{
	private Game game;
	
	public Main(Game game) {
		this.game = game;
	}
	
	public void run() {
		while(!this.game.isOver()) {
			game.updateAll();
			game.repaint();
			
			
			try {
				sleep(1_0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		Main rTe = new Main(game);
		rTe.start();

	}

}
