package interaction_strategies;

import model.ball.Ball;
import model.ball.Dispatcher;


/**
 * This class is essentially the no-op IInteractStrategy object that
 * each ball initially has.
 * @author ammeurer
 *
 */
public class NormalElasticStrategy implements IInteractStrategy {

	@Override
	public void interact(Ball context, Ball target, Dispatcher disp) {
		
	}
	
	

}
