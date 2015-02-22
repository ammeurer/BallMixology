package paint_strategies;

import java.awt.Graphics;

import model.ball.Ball;

/**
 * The Ball paint strategy directly implements the IPaintStrategy
 * interface, and does not use an Affine Transform, as all the 
 * other paint strategies do.
 * @author ammeurer
 *
 */
public class BallPaintStrategy implements IPaintStrategy {

	/**
	 * Paint a ball
	 */
	@Override
	public void paint(Graphics g, Ball host) {
		g.setColor(host.getColor());
		int xLoc = host.getLocation().x - (int) host.getRadius();
		int yLoc = host.getLocation().y - (int) host.getRadius();
		int diameter = (int) (2*host.getRadius());
		g.fillOval(xLoc, yLoc, diameter, diameter);
		// TODO Auto-generated method stub

	}

	@Override
	public void init(Ball host) {

	}

}
