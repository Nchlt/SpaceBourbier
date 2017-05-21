import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Display extends JPanel{
    private Game game;
	
	public Display(Game game) {
		super();
		this.game = game;
	}
	
	@Override
	public void paintComponent(Graphics gRaw) {
		Graphics2D g = (Graphics2D) gRaw;
		game.drawAll(g);
	}
	
}
