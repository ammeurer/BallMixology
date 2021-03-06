package paint_strategies;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;

import model.ball.Ball;

/**
 * ImagePaintStrategy paints an image from a file to the GUI
 * @author ammeurer
 *
 */
public class ImagePaintStrategy extends APaintStrategy {

	protected AffineTransform localAT = new AffineTransform();
	AffineTransform tempAT;
	private Image image;
	private String filename;
	private Component imageObs;
	private double scaleFactor;
	private double fillFactor;

	public ImagePaintStrategy(AffineTransform myAT, String file, double fillFac) {
		super(myAT);
		//localAT = myAT;
		filename = file;
		
		System.out.println(filename);
		fillFactor = fillFac;
		try {
			image = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource(filename));
		}
		catch (Exception e){
			System.err.println("ImagePaintStrategy: Error reading file: "+filename +"\n"+e);
		}
		
	}

  public void init(Ball host) {
	  imageObs = host.getPanel();
	  MediaTracker mt = new MediaTracker(host.getPanel());
	  mt.addImage(image, 1);
	  try {
		  mt.waitForAll();
	  }
	  catch(Exception e){
		  System.out.println("ImagePaintStrategy.init(): Error waiting for image.  Exception = "+e);
	  }
	  
	  scaleFactor = 2.0/(fillFactor*(image.getWidth(imageObs)+image.getHeight(imageObs))/2.0);
  }
  
  @Override			
  public void paintXfrm(Graphics g, Ball host, AffineTransform at){
	  localAT.setToScale(scaleFactor, scaleFactor);
	  localAT.translate(-image.getWidth(imageObs)/2.0, -image.getHeight(imageObs)/2.0);
	  localAT.preConcatenate(at);
	  ((Graphics2D)g).drawImage(image, localAT, imageObs); 
  }
}


