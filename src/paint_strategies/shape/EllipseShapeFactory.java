package paint_strategies.shape;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * The EllipseShapeFactory creates an ellipse shape
 * @author ammeurer
 *
 */
public class EllipseShapeFactory implements IShapeFactory {
	
	public static EllipseShapeFactory Singleton = new EllipseShapeFactory();
	
	public EllipseShapeFactory(){
		
	}

	@Override
	public Shape makeShape(double x, double y, double xScale, double yScale) {
		System.out.println("Got to shape factory");
		return new Ellipse2D.Double(x-(xScale/2), y-(yScale/2), xScale, yScale);
	}

}
