package update_strategies;

import model.ball.Ball;
import model.ball.Dispatcher;



/**
 * MultiStrategy is a recursive tree that allows the user to combine
 * as many strategies as they want.
 * @author ammeurer
 *
 */

public class MultiStrategy implements IUpdateStrategy {
	
	private IUpdateStrategy _s1;
	private IUpdateStrategy _s2;
	
	public MultiStrategy(IUpdateStrategy s1, IUpdateStrategy s2) {
		_s1 = s1;
		_s2 = s2;
	}
	
	public void updateState(Ball context, Dispatcher d) {
		_s1.updateState(context, d);
		_s2.updateState(context, d);
	}

	@Override
	public void init(Ball context) {
		// TODO Auto-generated method stub
		
	}
}
