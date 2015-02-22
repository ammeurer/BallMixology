package paint_strategies;

import java.awt.Graphics;

import model.ball.Ball;

/**
 * IPaintStrategy is the interface that all paint strategies implement
 * @author ammeurer
 *
 */
public interface IPaintStrategy {
	
	/**
	 * Paint operation that is called during the repaint process
	 * @param g is the Graphics object (GUI) being painted on
	 * @param host is the Ball object that is being (re)painted
	 */
	void paint(Graphics g, Ball host);
	
	/**
	 * initialize the strategy and host ball, if needed
	 * @param host is the Ball object that is being painted.
	 */
	void init(Ball host);

}
