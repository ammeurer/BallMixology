package update_strategies;

import model.ball.Ball;
import model.ball.Dispatcher;
import util.Randomizer;

/**
 * BalloonStrategy increases radius to a popping point, and then
 * quickly decreases radius, and appears to pop and disappear
 * @author ammeurer
 *
 */
public class BalloonStrategy implements IUpdateStrategy {

	/**
	 * Randomizer object generates the maximum radius before balloon ball 'pops'
	 */
	private Randomizer rand = new Randomizer();
	/**
	 * maximum radius
	 */
	private double pop = rand.randomDouble(200.0, 300.0);
	/**
	 * truncated version of pop
	 */
	private int popNow = (int) Math.floor(pop);
	/**
	 * timeToPop is 1 or 0 depending on whether the max radius 
	 * has been reached or not.
	 */
	private int timeToPop = 0;
	
	@Override
	public void updateState(Ball ball, Dispatcher d) {
		if((ball.getRadius() < (double) popNow) && (timeToPop == 0)){				
			double newRad = ball.getRadius()+0.8;
			ball.setRadius(newRad);
		}
		else{
			timeToPop = 1;
			double popRad = ball.getRadius()-7.0;
			ball.setRadius(popRad);
		}
	}

	@Override
	public void init(Ball context) {
		// TODO Auto-generated method stub
		
	}
}


