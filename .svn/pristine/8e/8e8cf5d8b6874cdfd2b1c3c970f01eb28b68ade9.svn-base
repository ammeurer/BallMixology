package paint_strategies;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import model.ball.Ball;

/**
 * PolygonPaintStrategy is a paint strategy that paints a polygon
 * @author ammeurer
 *
 */
public class PolygonPaintStrategy extends APaintStrategy {

	/**
	 * polygon shape object
	 */
	private Shape shape;

	public PolygonPaintStrategy(AffineTransform myAT, Shape this_shape) {
		super(myAT);
		shape = this_shape;
	}
	
	@Override
	public void paintXfrm(Graphics g, Ball host, AffineTransform myAT) {
	      g.setColor(host.getColor());
	      host.setLocation(new Point(host.getLocation().x-((int)shape.getBounds().getCenterX()), host.getLocation().y-((int)shape.getBounds().getCenterY())));
	      ((Graphics2D) g).fill(at.createTransformedShape(shape));
	}

}
