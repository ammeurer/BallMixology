package update_strategies;

import java.awt.Point;
import java.awt.Rectangle;

import model.ball.Ball;
import model.ball.Dispatcher;
import util.Randomizer;
/**
 * LostStrategy changes its velocity every 10 clock cycles 
 * for erratic movement
 * @author ammeurer
 *
 */
public class LostStrategy implements IUpdateStrategy {
	/**
	 * Randomizer object to generate random values
	 */
	Randomizer rand = new Randomizer();
	/**
	 * Rectangle object to define max velocity in x and y directions
	 */
	Rectangle rect = new Rectangle(30, 30);
	
	/**
	 * counter so that ball velocity doesn't change every clock cycle
	 */
	int wait = 0;

	@Override
	public void updateState(Ball thisBall, Dispatcher d) {
		if(wait == 10){
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
