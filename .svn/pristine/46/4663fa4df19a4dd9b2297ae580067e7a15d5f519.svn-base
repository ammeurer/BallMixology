package paint_strategies.shape;

import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * The PolygonFactory creates a polygon
 * @author ammeurer
 *
 */
public class PolygonFactory implements IShapeFactory {
	
	/**
	 * Affine Transform for polygon shape
	 */
	private AffineTransform AT;
	
	/**
	 * scale
	 */
	private double scale;
	
	/**
	 * polygon object that is being created
	 */
	private Polygon polygon;
	
	/**
	 * bounds of the rectangle that defines the boundary
	 * of the polygon
	 */
	private Rectangle2D bounds;
	
	/**
	 * horizontal coordinate of center of polygon
	 */
	private double xCenter;
	
	/**
	 * vertical coordinate of center of polygon
	 */
	private double yCenter;
	
	
	public PolygonFactory(AffineTransform at, double scaleFactor, Point[] points){
		AT = at;
		scale = scaleFactor;
		polygon = new Polygon();
		for(int i = 0; i < points.length; i++){
			polygon.addPoint(points[i].x,points[i].y);

		}
		bounds = polygon.getBounds2D();
		xCenter = bounds.getCenterX();
		yCenter = bounds.getCenterY();
	}

	@Override
	public Shape makeShape(double x, double y, double xScale, double yScale) {
	    AT.setToTranslation(x, y);
	    AT.scale(xScale*scale, yScale*scale);  // optional rotation can be added as well
	    return AT.createTransformedShape(polygon);
	}

}
