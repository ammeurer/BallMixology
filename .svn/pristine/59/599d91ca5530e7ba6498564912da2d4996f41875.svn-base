package interaction_strategies;

import update_strategies.IUpdateStrategy;
import model.ball.Ball;
import model.ball.Dispatcher;

/**
 * MultiStrategy is a recursive tree that allows the user to combine
 * as many strategies as they want.
 * @author ammeurer
 *
 */
public class MultiInteractStrategy implements IInteractStrategy{
	

		
		private IInteractStrategy _s1;
		private IInteractStrategy _s2;
		
		public MultiInteractStrategy(IInteractStrategy s1, IInteractStrategy s2) {
			_s1 = s1;
			_s2 = s2;
		}
		

		@Override
		public void interact(Ball context, Ball target, Dispatcher disp) {
			_s1.interact(context, target, disp);
			_s2.interact(context, target, disp);
		}

	
	}


