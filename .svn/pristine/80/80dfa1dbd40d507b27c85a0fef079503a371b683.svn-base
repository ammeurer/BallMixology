package paint_strategies;

import java.awt.geom.AffineTransform;

/**
 * FishPaintStrategy paints a composite shape that resembles a fish to the GUI
 * @author ammeurer
 *
 */
public class FishPaintStrategy extends MultiPaintStrategy {
	
	public FishPaintStrategy(){
		this(new AffineTransform(), 0, 0, 10.0/3.0, 2.0/3.0);
	}
	

	public FishPaintStrategy(AffineTransform at, double x, double y, double width, double height) {
		super(at, new APaintStrategy[]{new TrianglePaintStrategy(at, -4.0/3.0, -1.0/6.0, 1.0, 1.0), new EllipsePaintStrategy(at, 0, 0, 4.0/3.0, 2.0/3.0)});
	}
	


}
