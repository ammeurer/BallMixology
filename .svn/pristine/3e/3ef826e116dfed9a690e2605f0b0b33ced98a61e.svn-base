package paint_strategies;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;

import model.ball.Ball;

/**
 * MultiPaintStrategy creates a composite paint strategy
 * @author ammeurer
 *
 */
public class MultiPaintStrategy extends APaintStrategy {
	
	/**
	 * array of paint strategies to combine
	 */
	private APaintStrategy [] paintStrategies;
	
	public MultiPaintStrategy(AffineTransform at, APaintStrategy[] pStrats){
		super(at);
		paintStrategies = pStrats;
	}
	
	@Override
	public void paintXfrm(Graphics g, Ball host, AffineTransform myAT) {
		 for(int i = 0; i < paintStrategies.length; i++){
			 paintStrategies[i].paintXfrm(g, host, myAT);
		 }
	}
	
	public void init(Ball host){
		
	}

}
