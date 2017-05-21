import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Ship {
	private double x;
	private double y;
	private double width;
	private double height;
	private double dY;
	private double acceleration;
	
	private Color color;
	private Shape collider;

	
	public Ship(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		dY = 0;
		acceleration = 0.5f;
		color = Color.ORANGE;
		collider = new Rectangle2D.Double(x, y, width, height);
	}
	
	public void update() {
		y += dY;
	}

	public void draw(Graphics2D gRaw) {
		Graphics2D g = (Graphics2D) gRaw;
		this.collider = new Rectangle2D.Double(this.x, this.y, this.width, this.height);
		g.setColor(color);
		g.draw(collider);
		g.fill(collider);
		
	}
	
	public void impulseUp() {
		dY -= acceleration;
	}
	
	public void impulseDown() {
		dY += acceleration;
	}
	
}
