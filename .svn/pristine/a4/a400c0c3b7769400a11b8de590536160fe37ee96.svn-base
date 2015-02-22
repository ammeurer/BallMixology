package update_strategies;

import java.awt.Point;
import java.awt.Rectangle;

import model.ball.Ball;
import model.ball.Dispatcher;
import util.Randomizer;
/**
 * DodgeStrategy changes its velocity every 3 clock cycles 
 * for erratic movement like it is dodging someone
 * @author ammeurer
 *
 */
public class DodgeStrategy implements IUpdateStrategy {
	
	/**
	 * Randomizer object to generate random values
	 */
	Randomizer rand = new Randomizer();
	
	/**
	 * Rectangle object to define max velocity in x and y directions
	 */
	Rectangle rect = new Rectangle(50, 50);
	
	
	int wait = 0;

	@Override
	public void updateState(Ball thisBall, Dispatcher d) {
		if(wait == 3){
			Point v = rand.randomVel(rect);
			thisBall.setVelocity(v);
			wait = 0;
		}
		else{
			wait++;
		}

	}

	@Override
	public void init(Ball context) {
		// TODO Auto-generated method stub
		
	}

}