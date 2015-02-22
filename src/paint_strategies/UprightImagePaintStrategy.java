package paint_strategies;

import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import model.ball.Ball;

/**
 * UprightImagePaintStrategy ensures that an image/shape remains upright 
 * as it bounces.
 * @author ammeurer
 *
 */
public class UprightImagePaintStrategy extends ImagePaintStrategy {

	public UprightImagePaintStrategy(String filename, double fillFactor) {
		super(new AffineTransform (), filename, fillFactor);
	}

	public void paintCfg(Graphics g, Ball host){
	    super.paintCfg(g, host);
	    if(Math.abs(Math.atan2(host.getVelocity().y, host.getVelocity().x)) > Math.PI/2.0) {
	      at.scale(1.0, -1.0);
	    } 
	}
}
