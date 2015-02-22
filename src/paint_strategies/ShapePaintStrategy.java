package paint_strategies;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import model.ball.Ball;

/**
 * ShapePaintStrategy is a general shape paint class that defines
 * invariant aspects of a shape, like color.
 */
public class ShapePaintStrategy extends APaintStrategy{

	private Shape shape;
	
	public ShapePaintStrategy(AffineTransform myAT, Shape this_shape) {
		super(myAT);
		shape = this_shape;
	}


	@Override
	public void paintXfrm(Graphics g, Ball host, AffineTransform myAT) {
		g.setColor(host.getColor());
		((Graphics2D) g).fill(at.createTransformedShape(shape));
	}

}
