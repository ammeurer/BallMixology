package paint_strategies;

import java.awt.Point;
import java.awt.geom.AffineTransform;

import paint_strategies.shape.PolygonFactory;

/** 
 * Paint strategy to paint a triangle shape using the poly fac
 */ 
public class TrianglePaintStrategy extends PolygonPaintStrategy {
	
	/**
	 * define the points of a unit sized triangle
	 */
	private static Point [] points = {new Point(0,0), new Point(1,0), new Point(1,((int)Math.sqrt(5.0))/2)};
	
	public TrianglePaintStrategy(){	
		this(new AffineTransform(), 0, 0, 1.0, 1.0);	
	}

	public TrianglePaintStrategy(AffineTransform myAT, double x, double y, double xScale, double yScale) {
		super(myAT, (new PolygonFactory(myAT, 1.0, points)).makeShape(x, y, xScale, yScale));
	}

}
