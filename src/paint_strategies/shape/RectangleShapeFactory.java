package paint_strategies.shape;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 * The RectangeleShapeFactory creates a rectangle shape
 * @author ammeurer
 *
 */
public class RectangleShapeFactory implements IShapeFactory {
	
	public static RectangleShapeFactory Singleton = new RectangleShapeFactory();
	
	public RectangleShapeFactory(){
		
	}

	@Override
	public Shape makeShape(double x, double y, double xScale, double yScale) {
		return new Rectangle2D.Double(x-(xScale/2), y-(yScale/2), xScale, yScale);
	}

}
